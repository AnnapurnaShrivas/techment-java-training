package com.techment.classassignment;

public class Customer {
	
	int id,balance;
	String mobile,name;
	
	Customer(int id,String name,String mobile,int balance)
	{
		this.id=id;
		this.name=name;
		this.mobile=mobile;
		this.balance=balance;
		
	
				
	}
	
	public void showDetails()
	{
		System.out.println("Customer id = "+id);
		System.out.println("Customer name = "+name);
		System.out.println("Customer contact number = "+mobile);
		System.out.println("Customer balance= "+balance);
		
		if (balance==0)
			System.out.println("This customer has ZERO BALANCE ACCOUNT");
		else if (balance>0 && balance<=5000)
			System.out.println("This customer has SAVING ACCOUNT");
		else
			
			System.out.println("This customer has CURRENT ACCOUNT");
	}

	public static void main(String[] args) {
		
		Customer customer1= new Customer(1,"Annapurna","987654321",50000);
		Customer customer2= new Customer(2,"Annu","987654321",3000);
		Customer customer3= new Customer(3,"Aaisha","987654321",0);
		
		customer1.showDetails();
		System.out.println();
		customer2.showDetails();
		System.out.println();
		customer3.showDetails();
		

	}

}
