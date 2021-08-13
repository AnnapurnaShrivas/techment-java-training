package com.techment.classtest;



class Employee2
{
	String FirstName;
	String LastName;
	public Employee2(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}
	@Override
	public String toString() {
		return "Employee [FirstName=" + FirstName + ", LastName=" + LastName + "]";
	}
	
}
public class Question22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Scanner scanner = new Scanner(System.in);
		//System.out.println("Enter First Name of person 1 : ");
		//int number = scanner.nextInt();
		Employee2 emp1 = new Employee2("Raj", "Singh");
		Employee2 emp2 = new Employee2("Ramesh", "Lal");
		Employee2 emp3 = new Employee2("Tarak", "Mehta");
		System.out.println(emp1.toString());
		System.out.println(emp2.toString());
		System.out.println(emp3.toString());
		

	}

}
