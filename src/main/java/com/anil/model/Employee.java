package com.anil.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "employee")
public class Employee {
	@Id
	@Column(name = "eid")
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	private String email;
	private double salary;

	public Employee() {
		super();
	}
	public Employee(Integer empId, String empName, String email, double salary) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.email = email;
		this.salary = salary;
	}


	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", email=" + email + ", salary=" + salary + "]";
	}

}
