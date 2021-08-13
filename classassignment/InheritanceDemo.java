package com.techment.classassignment;


public class InheritanceDemo {
	
	public static void main(String[] args) {
		
		Employee employee = new Employee();
		Student student =new Student();
		
	employee.id=1;
	employee.age=24;
	employee.name="Annu";
	employee.designation="Developer";
	employee.companyName="TECHMENT";
	
	student.id=10001;
	student.age=24;
	student.name="Annu";
	student.deptment="Electronics and Telecomm";
	student.collegeName="LCIT";
	
	System.out.println("==============EMPLOYEE DETAILS==================\n\n");
	employee.DisplayDetails();
	
	System.out.println("==============STUDENT DETAILS==================\n\n");
	student.DisplayDetails();
	
		
	}

	
	
	}
