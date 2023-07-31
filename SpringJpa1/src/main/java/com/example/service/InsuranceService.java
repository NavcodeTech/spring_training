package com.example.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.InsuranceRepository;
import com.example.exception.InsuranceException;
import com.example.model.Insurance;


@Service
public class InsuranceService {
	@Autowired
	InsuranceRepository dao;
	
	public Insurance addInsurance(Insurance insurance) throws InsuranceException
	{
		Optional<Insurance> findById=dao.findById(insurance.getId());
		if(!findById.isPresent())
		{
			System.out.println("Added");
			dao.save(insurance);
			return insurance;
		}
		else
			throw new InsuranceException("Insurance already present");
		
	}
	public Insurance searchInsurance(int id) throws InsuranceException
	{
		Optional<Insurance> findById=dao.findById(id);
		if(findById.isPresent())
			return findById.get();
		else
			throw new InsuranceException("Not Found");
	}
	
	public List<Insurance> getAllInsurance() throws InsuranceException
	{
		if(dao.findAll().size()==0)
			throw new InsuranceException("Insurance list is Empty");
		else
			return dao.findAll();
	}
}
