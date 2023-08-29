package com.icicibk.empms2.dto;

import java.time.LocalDate;
import java.time.LocalDateTime;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;
import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "emp_table")
public class Employee {
	
	@Id
	private String empId;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE)
	@JsonFormat(pattern = "MM/dd/yyyy")
	private LocalDate doj;
	
	@DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
	@JsonFormat(pattern = "MM/dd/yyyy HH/mm/ss")
	private LocalDateTime doj2;
	
	@NotBlank(message = "emp first name should not be blank")
	private String empFirstName;
	private String empAddress;
	@NotEmpty
	private String empLastName;
	@NotNull(message = "float value should be provided")
	@DecimalMin(value = "1.0")
	@DecimalMax("2.0")
	private Float empSalary;
	@Min(value = 18)
	@Max(value = 55)
	private int age; 
	@Column(unique = true)
	private String contactNumber;
//	@ManyToOne(fetch = FetchType.LAZY)
//	@JoinColumn(name = "dept_id", nullable = false)
//	@OnDelete(action = OnDeleteAction.CASCADE)
//	@JsonIgnoreProperties
//	private Department department;
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empFirstName=" + empFirstName + ", empAddress=" + empAddress
				+ ", empLastName=" + empLastName + ", empSalary=" + empSalary + ", contactNumber=" + contactNumber
				+ "]";
	}

	
	
}
