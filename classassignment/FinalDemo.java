package com.techment.classassignment;

 class Employee3

{
	static String dept;
	final int id=1;   // value is fixed now
	}
public class FinalDemo {

	public static void main(String[] args) {

		final int a=100;
		// a++; ->it can not be change because a in declared final
		
		Employee3 emp1= new Employee3();
		Employee3 emp2= new Employee3();

		emp1.dept="Developer";
		emp2.dept="HR";
		
		System.out.println("emp 1="+emp1.dept);
		System.out.println("emp 2="+emp2.dept); 
		// in output we see updated value ie HR
		
		System.out.println("final value emp 1= "+emp1.id);
		System.out.println("final value emp 2= "+emp2.id);

	}

}
