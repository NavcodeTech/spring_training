//package com.example;
//
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ConfigurableApplicationContext;
//
//import com.example.dao.InsuranceRepository;
//import com.example.model.Insurance;
//import com.example.model.User1;
//import java.util.*;
//
//@SpringBootApplication
//public class UserMain implements CommandLineRunner{
//	public static void main(String[] args) {
//		ConfigurableApplicationContext ctx=SpringApplication.run(UserMain.class,args);
//		User1 user1=ctx.getBean(User1.class);
//		System.out.println(user1);
//		
//		//InsuranceRepository dao= ctx.getBean(InsuranceRepository.class);
//		
////		Insurance ins1=new Insurance();
////		ins1.setName("jeevan Sharma");
////		ins1.setPayment(20000);
////		ins1.setDuration(12);
////		
////		Insurance ins2=new Insurance();
////		ins2.setName("Naveen raj");
////		ins2.setPayment(30000);
////		ins2.setDuration(12);
////		
////		Insurance ins3=new Insurance();
////		ins3.setName("Shekar Sharma");
////		ins3.setPayment(200333);
////		ins3.setDuration(9);
//		
////		dao.save(ins1);
////		dao.save(ins2);
////		dao.save(ins3);
////		
////		List<Insurance> findAll= dao.findAll();
////		
////		findAll.forEach(a->System.out.println(a));  
//		
//		
//	}
//	@Autowired
//	InsuranceRepository dao;
//	@Override
//	public void run(String... args) throws Exception {
//		// TODO Auto-generated method stub
//		Insurance ins1=new Insurance();
//		ins1.setName("jeevi kumar");
//	    ins1.setPayment(20000);
//		ins1.setDuration(12);
//		
//		Insurance ins2=new Insurance();
//		ins2.setName("Nav raj");
//		ins2.setPayment(30000);
//		ins2.setDuration(12);
//		
//		Insurance ins3=new Insurance();
//		ins3.setName("Shek Shaily");
//		ins3.setPayment(200333);
//		ins3.setDuration(9);
//		
//		dao.save(ins1);
//		dao.save(ins2);
//		dao.save(ins3);
//		
//		List<Insurance> findAll= dao.findAll();
//	
//		findAll.forEach(a->System.out.println(a));
//		
//	}
//	
//	
//	
//	
//}
