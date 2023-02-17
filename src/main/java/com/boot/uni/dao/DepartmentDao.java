package com.boot.uni.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.uni.entities.Department;

public interface DepartmentDao extends JpaRepository<Department, Integer>{

}
