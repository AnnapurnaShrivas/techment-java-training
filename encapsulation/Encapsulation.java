package com.techment.encapsulation;

class Employee
{
	private int id;            // we make Encapsulation by making is private
	private String name;
	}
public class Encapsulation {

	public static void main(String[] args) {
		
		Employee emp= new Employee();
		//emp.id=1;
		//emp.name="Annu";                    // showing error  because of private access specifier
		
		//System.out.println(emp.id);

	}

}
