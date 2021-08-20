package com.techment.utility;

import java.util.HashMap;
import java.util.Map;

import com.techment.model.Employee;

public class CollectionUtil {

	static Map<Integer, Employee> employees = new HashMap<Integer, Employee>();
	
	static
	{

		employees.put(1, new Employee(1,"john","hr",30000));
		employees.put(2, new Employee(2,"sachin","developer",35000));
		employees.put(3, new Employee(3,"abhishek","manager",45000));
		employees.put(4, new Employee(4,"mukesh","hr",25000));
	}
	
	// returns emplyee map list
	// this methos is used to get the employee maao ,
	// which we initialized the 
	public static Map<Integer,Employee> getEmployeeList()
	{
		return employees;
	}
	
}
