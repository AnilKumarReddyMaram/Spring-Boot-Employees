package com.anil.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.anil.model.Employee;
import com.anil.service.EmployeeService;

@RestController
public class EmployeeController {
	@Autowired
	private EmployeeService service;

	@PostMapping("/save")
	public String save(@RequestBody Employee emp, Model m) {
		Employee e = service.saveEmployee(emp);
		String message = null;
		if (e != null) {
			message = "Employee Data saved successfully in DataBase";
		} else {
			message = "Employee not save in Database";
		}
		return message;
	}

	@PutMapping("/update/{empId}")
	public Employee update(@RequestBody Employee emp, @PathVariable Integer empId) {
		Employee e = service.updateEmployee(emp, empId);
		return e;
	}

	@DeleteMapping("/delete/{empId}")
	public void delete(@PathVariable Integer empId) {
		service.deleteEmployee(empId);
	}

	@GetMapping("/get/{empId}")
	public Employee getOne(@PathVariable Integer empId) {
		Employee emp = service.getEmployee(empId);
		return emp;
	}
	@GetMapping("/getAll")
	public List<Employee> getAll() {
		List<Employee> emps=service.getAllEmployee();
		return emps;
	}
}
