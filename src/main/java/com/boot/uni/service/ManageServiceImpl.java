package com.boot.uni.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.uni.dao.DepartmentDao;
import com.boot.uni.dao.EmployeeDao;
import com.boot.uni.entities.Department;
import com.boot.uni.entities.Employee;

@Service
public class ManageServiceImpl implements ManageService {

	@Autowired
	private EmployeeDao employeeDao;
	@Autowired
	private DepartmentDao departmentDao;

	@Override
	public List<Employee> getEmployees() {
		return employeeDao.findAll();
	}

	@Override
	public List<Department> getDepartment() {
		return departmentDao.findAll();
	}

	@Override
	public Employee getEmployee(int empId) {
		return employeeDao.findById(empId).get();
	}

	@Override
	public Department getDepartment(int empId) {
		return (employeeDao.findById(empId).get()).getDepartment();
	}

	@Override
	public Employee addEmployee(Employee employee) {
		return employeeDao.save(employee);
		
	}

	@Override
	public Department addDepartment(Department department) {
		return departmentDao.save(department);
	}

	@Override
	public String deleteEmployee(int empId) {
		Employee entity = employeeDao.getOne(empId);
		 employeeDao.delete(entity);
		return entity.getName()+" Employee Object has Deleted";
	}

	@Override
	public String deleteDepartment(int departmentId) {
		Department departEntity = departmentDao.getOne(departmentId); 
		departmentDao.delete(departEntity);
		return departEntity.getDepName()+" Department Object has Deleted";
	}

	@Override
	public Employee updateEmployee(Employee employee) {
		employeeDao.save(employee);
		return employee;
	}

	@Override
	public Department updateDepartment(Department department) {
		departmentDao.save(department);
		return department;
	}
	

}
