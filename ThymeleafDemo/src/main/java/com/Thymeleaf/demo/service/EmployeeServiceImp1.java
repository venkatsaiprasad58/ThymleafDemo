package com.Thymeleaf.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Thymeleaf.demo.dao.EmpRepository;
import com.Thymeleaf.demo.model.Employee;

@Service
public class EmployeeServiceImp1 implements EmpolyeeService {

	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<Employee> findAll() {
		// TODO Auto-generated method stub
		return empRepository.findAll();
	}

	@Override
	public void save(Employee theEmployee) {
		// TODO Auto-generated method stub
		 empRepository.save(theEmployee);
	}

	@Override
	public void deleteById(Long theId) {
		// TODO Auto-generated method stub
		empRepository.deleteById(theId);
	}
	
}
