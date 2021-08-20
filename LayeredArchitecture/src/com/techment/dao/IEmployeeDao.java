package com.techment.dao;

import java.util.List;

import com.techment.model.Employee;

public interface IEmployeeDao {

	Employee getEmployeeById(int id);   // it returns object
	List<Employee> getEmployeeByDept(String dept);
	//List .. because it has multiple values
	
}
