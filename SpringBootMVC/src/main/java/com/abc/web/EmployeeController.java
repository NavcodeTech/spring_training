package com.abc.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.abc.exception.EmployeeException;
import com.abc.model.Employee;
import com.abc.service.EmployeeService;

@Controller
@RequestMapping("/")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("/form")
	public String employeeForm()
	{
		return "EmployeeForm";
	}
	
	@GetMapping("/empAction")
	public String empFormProcess(ModelMap map,@RequestParam("id") int id,@RequestParam("name") String name,@RequestParam("salary") float salary) throws EmployeeException
	{
			
	    if(id<=0)
			throw new EmployeeException(" id is less than zero.");
		
		else if(id<1000 || id>=10000)
			throw new EmployeeException("id is not in range.Inavlid Id!!");
		
		else if(name.isBlank())
			throw new EmployeeException("name is blank");
		
		else if(name.length()<5)
			throw new EmployeeException("name should consist of  minimum 5 characters");
		
		else if(salary<=0)
			throw new EmployeeException("Salary can't be zero or minus");
		
		else if(salary<10000 || salary>=600000)
			throw new EmployeeException("Maxm is 600000 and Minm is 10000");
		
		else
		{
		Employee emp=new Employee();
		emp.setId(id);
		emp.setName(name);
		emp.setSalary(salary);
		map.addAttribute("employee",emp);
		
		service.addEmployee(emp);
		map.addAttribute("list",service.getAllEmployee());
		
		
		return "EmpResult";
		}
	}
//	@ExceptionHandler(value=EmployeeException.class)
//	public String handleError()
//	{
//		return "error";
//	}
//	@ExceptionHandler(value=Exception.class)
//	public String handleError1()
//	{
//		return "error";
//	}
	
	public String welcome()
	{
		return "index";
	}
//	@GetMapping("/allemp")
//	public String allEmp()
//	{
//		return "EmployeeForm";
//	}
}