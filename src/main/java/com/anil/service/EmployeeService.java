package com.anil.service;

import java.util.List;

import com.anil.model.Employee;

public interface EmployeeService {
	public Employee saveEmployee(Employee emp);
	public Employee updateEmployee(Employee emp,Integer empId);
	public void deleteEmployee(Integer empId);
	public Employee getEmployee(Integer empId);
	public List<Employee> getAllEmployee();

}
