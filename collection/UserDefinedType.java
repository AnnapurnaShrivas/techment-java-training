package com.techment.collection;


// connected with employee program

import java.util.ArrayList;

public class UserDefinedType {

	public static void main(String[] args) {
		
		
		Employee emp1 = new Employee(1,"Annu","Developer");
		Employee emp2 = new Employee(2,"Annapurna","Hr");

		ArrayList<Employee> employees = new ArrayList<Employee>();
		employees.add(emp1);
		employees.add(emp2);
		employees.add(new Employee(3,"shubham","developer"));
		
		
		/*for(Employee emp : employees)
		{
			System.out.println(emp.id+" "+emp.name+" "+emp.dept);
		}
		*/
		
		for (Employee emp :employees)           // for gutter and setter
				 {
			if(emp.getId()>2)
				emp.setDept("Manager");
			
			System.out.println(emp.getId()+" "+emp.getName()+" "+emp.getDept());
			
		}
		
		
	}

}
