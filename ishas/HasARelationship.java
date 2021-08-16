package com.techment.ishas;

class Employee
{
	int id;
	String name;
	Address address;      // object Reference
	public Employee(int id, String name, Address address) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
	}
	
	    void displayEmpInfo()
	    
	    {
	    	System.out.println("id : "+id);
	    	System.out.println("name : "+name);
	    	System.out.println("doorNo : "+address.doorNo);   // Has A Relationship
	    	System.out.println("city : "+address.city);
	    	System.out.println("pinCode : "+address.pincode);
	    }
	}

class Address
{
   int doorNo;
   String streetName;
   String city;
   int pincode;
public Address(int doorNo, String streetName, String city, int pincode) {    // generated construstor
	super();
	this.doorNo = doorNo;
	this.streetName = streetName;
	this.city = city;
	this.pincode = pincode;
}
   
   
   
}

public class HasARelationship {

	public static void main(String[] args) {
		
		Address address= new Address(101,"Annu","Bilaspur",495004);
		
		Employee employee = new Employee(7654, "Annu", address);
				
				employee.displayEmpInfo();
		
	}

}
