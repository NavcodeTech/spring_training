package com.abc.service;



import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.abc.dao.EmployeeRepository;
import com.abc.exception.EmployeeException;
import com.abc.model.Employee;

@Service
public class EmployeeService {
	@Autowired
	EmployeeRepository dao;
	
	public boolean addEmployee(Employee emp) throws EmployeeException
	{
		Optional<Employee> findById=dao.findById(emp.getId());
		if(!findById.isPresent())
		{
			dao.save(emp);
			return true;
		}
		throw new EmployeeException("Employee already present");
		//return false;
	}
	public List<Employee> getAllEmployee() throws EmployeeException
	{
		if(dao.findAll().size()==0)
			throw new EmployeeException("List is empty");
		else
			return dao.findAll();
	}
}
