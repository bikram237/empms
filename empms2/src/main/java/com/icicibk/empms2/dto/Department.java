package com.icicibk.empms2.dto;

import java.util.Set;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Department {
	@NotBlank
	private String deptName;
	@Id
	private String depId;

	private double headCount;
	private String location;
//	@OneToMany(mappedBy = "department", fetch = FetchType.LAZY)
//	private Set<Employee> employees;

}
