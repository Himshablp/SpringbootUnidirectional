package com.boot.uni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.uni.entities.Employee;

public interface EmployeeDao extends JpaRepository<Employee, Integer>{

}
