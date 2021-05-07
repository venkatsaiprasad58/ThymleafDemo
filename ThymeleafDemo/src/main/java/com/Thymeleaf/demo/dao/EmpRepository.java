package com.Thymeleaf.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.Thymeleaf.demo.model.Employee;
@Repository
public interface EmpRepository extends JpaRepository<Employee, Long> {
	
	
}
