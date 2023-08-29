package com.icicibk.empms2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.icicibk.empms2.dto.Employee;
import com.icicibk.empms2.services.EmployeeService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/emp")
public class controller {
	
	@Autowired
	EmployeeService employeeService;
	
	@PostMapping("/createEmp")
	public Employee createEmployee(@Valid @RequestBody Employee employee) {
		
		return employeeService.addEmployee(employee);
		
		
	}

}
