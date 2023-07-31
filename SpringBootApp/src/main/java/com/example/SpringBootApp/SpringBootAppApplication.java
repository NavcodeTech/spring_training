package com.example.SpringBootApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.model.Employee;

@SpringBootApplication(scanBasePackages="com.example.model")
public class SpringBootAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx=SpringApplication.run(SpringBootAppApplication.class, args);

		 Employee bean=ctx.getBean(Employee.class);

		 System.out.println(bean);
		 //System.out.println(bean.get);
	}

}
