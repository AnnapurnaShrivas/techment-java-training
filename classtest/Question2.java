package com.techment.classtest;

class Employee
{
	String firstName;
	String lastName;
	public Employee(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String toString()
	{
		return firstName+" "+lastName;
	}
	
}

public class Question2{

	public static void main(String[] args) {
		
		Employee emp1= new Employee("Annapurna", "Shrivas");
		Employee emp2= new Employee("priyanka", "Singh");
		Employee emp3= new Employee("Shubham", "Bhope");
		
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());

	}

}
