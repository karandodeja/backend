package com.java.emsystem.services;

import java.util.List;

import com.java.emsystem.model.Employee;

public interface EmployeeService {

	Employee createEmployee(Employee employee);

	List<Employee> getEmployees();

	boolean deleteEmployee(Long id);

	Employee getEmployeesById(Long id);

	Employee updateEmployee(Long id, Employee employee);
	
}
