package com.boot.uni.entities;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Department {
	@Id
	private int depId;
	private String depName;
	@Autowired
	@OneToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private List<Employee> empList;

	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Department(int depId, String depName, List<Employee> empList) {
		super();
		this.depId = depId;
		this.depName = depName;
		this.empList = empList;
	}

	public int getDepId() {
		return depId;
	}

	public void setDepId(int depId) {
		this.depId = depId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public List<Employee> getEmpList() {
		return empList;
	}

	public void setEmpList(List<Employee> empList) {
		this.empList = empList;
	}

	@Override
	public String toString() {
		return "Department [depId=" + depId + ", depName=" + depName + "]";
	}

}
