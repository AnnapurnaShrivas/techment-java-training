package com.techment.collection;

import java.util.ArrayList;
import java.util.Collections;

class Employee2 implements Comparable<Employee2>
{
	int id;
	String name;
	String dept;
	int age;
	public Employee2(int id, String name, String dept, int age) {
		super();
		this.id = id;
		this.name = name;
		this.dept = dept;
		this.age = age;
	}
	
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", dept=" + dept + ", age=" + age + "]";
	}


	public int compareTo(Employee2 o) {
		if(this.age==o.age)
			return 0;
		else if(this.age>o.age)
			return 1;
		else return -1;
		
	}


	public int compareTo1(Employee2 o) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
	
	
	
}

public class UserDefineExample {

	public static void main(String[] args) {
		

		Employee2 e =new Employee2(1, "Annapurnafghjkl", "Manager", 76);
		
		ArrayList<Employee2> employees = new ArrayList<Employee2>();
		employees.add(new Employee2 (1,"ramesh","hr",34));
		employees.add(new Employee2 (2,"anil","manager",45));
		employees.add(new Employee2(3,"manish","Developer",56));
		employees.add(new Employee2(4,"manoj","assistent",28));
		
		for(Employee2 emp : employees)
		{
			System.out.println(emp.id +" ,  "+emp.name+" , "+emp.dept+" , "+emp.age);
		}
		
		
		System.out.println("===========sorted=======\n");
		Collections.sort(employees);
		System.out.println(employees);
		
		System.out.println("===============");
		for(Employee2 emp : employees)
		{
			System.out.println(emp.id +" ,  "+emp.name+" , "+emp.dept+" , "+emp.age);
		}
		
		
	}

}
