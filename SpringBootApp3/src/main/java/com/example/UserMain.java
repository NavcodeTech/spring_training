package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.User1;

@SpringBootApplication
public class UserMain {
	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(UserMain.class,args);
		User1 user1=ctx.getBean(User1.class);
		System.out.println(user1);
	}
}
