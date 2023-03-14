package com.anil.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.anil.model.Employee;
@Repository
public interface EmployeeRepo extends JpaRepository<Employee, Integer> {

}
