package com.abc.web;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.abc.exception.EmployeeException;

@ControllerAdvice
public class GlobalException {
	@ExceptionHandler(value=EmployeeException.class)
	public String handleError()
	{
		return "error";
	}
	@ExceptionHandler(value=Exception.class)
	public String handleError1()
	{
		return "error";
	}
}
