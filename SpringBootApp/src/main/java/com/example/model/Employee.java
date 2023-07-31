package com.example.model;

import org.springframework.stereotype.Component;



import jakarta.annotation.PostConstruct;

import lombok.Data;

@Data

@Component

public class Employee {

 private int id;

 private String name;

 private float salary;

 @PostConstruct

 public void init() {

 this.id=5467834;

 this.name="ram kumar";

 this.salary=20000;

 }

}