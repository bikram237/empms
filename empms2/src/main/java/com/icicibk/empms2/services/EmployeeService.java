package com.icicibk.empms2.services;

import java.util.List;
import java.util.Optional;

import com.icicibk.empms2.dto.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);

	public String deleteEmployeeById(String empId);

	public String updateEmployee(String empId, Employee employee);

	public Optional<Employee> getEmployeeById(String empId);

	public List<Employee> getEmployes();

	List<Employee> getEmployees();

}
