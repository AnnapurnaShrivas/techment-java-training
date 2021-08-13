package com.techment.oppsassignment;

//  5 – Inheritance and Abstraction....QUESTION NO.5

import java.util.Random;
import java.util.Scanner;

abstract class Medicine
{
float price;
		String expDate;
	abstract void displayLabel();
	
	
	 void getDetails()
	 {
			Scanner sc= new Scanner(System.in);
	     System.out.println("Enter Price ");
	    
		price = sc.nextFloat();
		
		System.out.println("Enter expiry Date ");
		expDate= sc.next();
		
		 
	 }
	
}


class Tablet extends Medicine
{
   
	int quantity=30;
	
	
	@Override
	void displayLabel() {
		
		System.out.println(" Tablet quantity = "+quantity);
		System.out.println("Tablet Price = "+price);
		System.out.println(" Tablet Expiry date "+expDate);
		System.out.println("\nstore in a cool dry place\n");
	}
	
	}

class Syrup extends Medicine
{
	int quantity= 100;

	@Override
	void displayLabel() {
		System.out.println(" Syrup quantity = "+quantity+"ml");
		System.out.println("Syrup Price = "+price);
		System.out.println(" Syrup Expiry date "+expDate);
		System.out.println("\nNot for children less than 2 years\n");
		
	}
	}

class Ointment extends Medicine
{
	int quantity=5;

	@Override
	void displayLabel() {
		System.out.println(" Ointment quantity = "+quantity+" peice");
		System.out.println("Ointment Price = "+price);
		System.out.println(" Ointment Expiry date "+expDate);
		System.out.println("\nfor external use only\n");
		
	}
	}



public class TestMedicine{
	
	Scanner sc= new Scanner(System.in);

	public static void main(String[] args) {
		
		Medicine medicine[] = new Medicine[5];
//		
//		medicine[0].getDetails();
//		medicine[1].getDetails();
//		medicine[2].getDetails();
//		medicine[3].getDetails();
//		medicine[4].getDetails();
//		
		
		Random random = new Random();
		if(random.nextInt(3)==3)
		{
			medicine[3] = new Ointment();
			medicine[3].getDetails();
			medicine[3].displayLabel();
			
		}
		else if(random.nextInt(3)==2) {
		    medicine[2] = new Tablet();
		    medicine[2].getDetails();
		    medicine[2].displayLabel();
		}
		else
		{
		medicine[0] = new Syrup();
		medicine[0].getDetails();
		medicine[0].displayLabel();
		
		}
		
		
 
	
	}

}
