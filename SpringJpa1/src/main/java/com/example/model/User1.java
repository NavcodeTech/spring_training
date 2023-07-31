package com.example.model;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import lombok.Data;


@Data
@Component
@PropertySource(value="user1.properties")
public class User1 {	
	@Value("${user1.id}")
	private int id;
	@Value("${user1.name}")
	private String name;
	@Value("${user1.salary}")
	private float salary;
}
