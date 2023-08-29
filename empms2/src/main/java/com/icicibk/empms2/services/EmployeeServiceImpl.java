package com.icicibk.empms2.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.icicibk.empms2.dto.Employee;
import com.icicibk.empms2.repo.EmployeeRepository;
import com.icicibk.empms2.services.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	@Autowired
	private EmployeeRepository employeeRepository ;
	
//	private static EmployeeService employeeService;
//	
//	private EmployeeServiceImpl() {
//		// TODO Auto-generated constructor stub
//	}
//	
//	public static EmployeeService getInstance() {
//		if(employeeService==null)
//			employeeService = new EmployeeServiceImpl();
//		return employeeService;
//		
//	}
	
	@Override
	public Employee addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		// addEmployee from repo
		return employeeRepository.save(employee);
	}

	@Override
	public String deleteEmployeeById(String empId) {
		// TODO Auto-generated method stub
		employeeRepository.deleteById(empId);
		return empId;
	
	}

	@Override
	public String updateEmployee(String empId, Employee employee) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Employee> getEmployeeById(String empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findById(empId);
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	public List<Employee> getEmployes() {
		// TODO Auto-generated method stub
		return null;
	}

}