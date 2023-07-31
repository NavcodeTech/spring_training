package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;

import com.example.exception.InsuranceException;
import com.example.model.Insurance;
//import com.example.model.User1;
import com.example.service.InsuranceService;

@SpringBootApplication
public class InsuranceMain implements CommandLineRunner{
	
	
	public static void main(String[] args) {
		
		SpringApplication.run(InsuranceMain.class, args);
	}
	@Autowired
	InsuranceService service;
	
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		Insurance ins1=new Insurance();
		ins1.setId(101);
		ins1.setName("jeevi kumar");
	    ins1.setPayment(20000);
		ins1.setDuration(12);
		
		Insurance ins2=new Insurance();
		ins2.setId(102);
		ins2.setName("Nav raj");
		ins2.setPayment(30000);
		ins2.setDuration(12);
		
		try {
			service.addInsurance(ins1);
			service.addInsurance(ins2);
			service.addInsurance(ins2);
			
		}
		catch(InsuranceException e)
		{
			System.err.println(e);
		}
		System.out.println("IOnsurance get All operations");
		try
		{
			service.getAllInsurance().forEach(System.out::println);
		}
		catch(InsuranceException e)
		{
			System.err.println();
		}
	}
	
}
