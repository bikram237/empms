package com.icicibk.empms2.services;

import java.util.List;
import java.util.Optional;

import com.icicibk.empms2.dto.Department;

public interface DepartmentService {
	
	public Department addDepartment(Department department);

	public String deleteDepartmentId(String depId);

	public String updateDepartment(String depId, Department department);

	public Optional<Department> getDepartmentById(String depId);

	public List<Department> getDepartments();

	Optional<Department> getDeptById(String depId);

}
