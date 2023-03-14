package com.anil.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.anil.model.Employee;
import com.anil.repo.EmployeeRepo;
@Service
public class EmployeeServiceImp implements EmployeeService {

	@Autowired
	private EmployeeRepo repo;
	@Override
	public Employee saveEmployee(Employee emp) {
		return repo.save(emp);
	}

	@Override
	public Employee updateEmployee(Employee emp, Integer empId) {
		Optional<Employee> optional=repo.findById(empId);
		Employee emp1=optional.get();
		emp1.setEmpId(empId);
		emp1.setEmpName(emp.getEmpName());
		emp1.setEmail(emp.getEmail());
		emp1.setSalary(emp.getSalary());
		return repo.save(emp1);
	}


	@Override
	public void deleteEmployee(Integer empId) {
		repo.deleteById(empId);

	}

	@Override
	public Employee getEmployee(Integer empId) {
		Employee e=repo.findById(empId).get();
		return e;
	}

	@Override
	public List<Employee> getAllEmployee() {
		List<Employee> emps=repo.findAll();
		return emps;
	}

}
