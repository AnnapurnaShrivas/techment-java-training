package com.techment.Exception;

import java.io.FileNotFoundException;
/*
class Student
{
	void checkEligiblity(int age)
	{
		if (age>=18)
			System.out.println("You can apply for loan");
		else
			throw new ArithmeticException("You can not apply for loan");
	}
}

*/
class Employee
{
	void checkEligiblity(int apply) throws FileNotFoundException
	{
		if (apply>=18)
			System.out.println("You can apply for job");
		else
			throw new FileNotFoundException("You can not apply for job");
	}
}




public class ThrowDemo {

	public static void main(String[] args) throws FileNotFoundException {

	//	Student student = new Student();
	//	student.checkEligiblity(15);
		
		Employee employee = new Employee();
		employee.checkEligiblity(17);
		
		
		

	}

}
