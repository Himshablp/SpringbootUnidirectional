package com.boot.uni.service;

import java.util.List;

import com.boot.uni.entities.Department;
import com.boot.uni.entities.Employee;

public interface ManageService {

	List<Employee> getEmployees();

	List<Department> getDepartment();

	Employee getEmployee(int empId);

	Department getDepartment(int empId);

	Employee addEmployee(Employee employee);

	Department addDepartment(Department department);

	String deleteEmployee(int empId);

	String deleteDepartment(int departmentId);

	Employee updateEmployee(Employee employee);

	Department updateDepartment(Department department);

}
