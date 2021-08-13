package com.techment.abstraction;

class Employee
{
	static String dept;
	final int id=1;   // value is fixed now
	}

public class FinalDemo {

	public static void main(String[] args) {

		final int a=100;
		// a++; ->it can not be change because a in declared final
		
		Employee emp1= new Employee();
		Employee emp2= new Employee();

		emp1.dept="Developer";
		emp2.dept="HR";
		
		System.out.println("emp 1="+emp1.dept);
		System.out.println("emp 2="+emp2.dept); 
		// in output we see updated value ie HR
		
		System.out.println("final value emp 1= "+emp1.id);
		System.out.println("final value emp 2= "+emp2.id);

	}

}
