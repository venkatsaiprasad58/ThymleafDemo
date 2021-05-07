package com.Thymeleaf.demo.service;

import java.util.List;

import com.Thymeleaf.demo.model.Employee;

public interface EmpolyeeService {
	public List<Employee> findAll();
	
	public void save(Employee theEmployee);
	public void deleteById(Long theId);

}
