package com.boot.uni.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.uni.entities.Department;
import com.boot.uni.entities.Employee;
import com.boot.uni.service.ManageService;

@RestController
public class MyController {
	
	@Autowired
	private ManageService manageservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcome to Spring boot Unidirectional Project";
	}
	
	@GetMapping("/employee")
	public List<Employee> getEmployees(){
		return this.manageservice.getEmployees();
	}
	
	@GetMapping("/department")
	public List<Department> getDepartment(){
		return this.manageservice.getDepartment();
	}
	
	@GetMapping("/employee/{empId}")
	public Employee getEmployee(@PathVariable int empId) {
		return this.manageservice.getEmployee(empId);
	}
	@GetMapping("/department/{empId}")
	public Department getDepartment(@PathVariable int empId) {
		return this.manageservice.getDepartment(empId);
	}
	
	@PostMapping("/employee")
	public Employee addEmployee(@RequestBody Employee employee) {
		return this.manageservice.addEmployee(employee);
	}
	
	@PostMapping("/department")
	public Department addDepartment(@RequestBody Department department) {
		return this.manageservice.addDepartment(department);
	}

	@DeleteMapping("/employee/{empId}")
	public String deleteEmployee(@PathVariable int empId) {
		return this.manageservice.deleteEmployee(empId);
	}
	
	@DeleteMapping("/department/{departmentId}")
	public String deleteDepartment(@PathVariable int departmentId) {
		return this.manageservice.deleteDepartment(departmentId);
	}
	
	@PutMapping("/employee")
	public Employee updateEmployee(@RequestBody Employee employee) {
		return this.manageservice.updateEmployee(employee);
	}
	
	@PutMapping("/department")
	public Department updateDepartment(@RequestBody Department department) {
		return this.manageservice.updateDepartment(department);
	}
	

}
