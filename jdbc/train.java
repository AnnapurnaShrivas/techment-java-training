package com.techment.jdbc;

import java.util.Scanner;

class prices
      {
	String gender;
	double price= 0;
			void cal(int age, String gender)
			{
			
			if (age<=12)
			{
				System.out.println("age is less then 12");
				price +=(2500*0.5);
			System.out.println("price = "+price);
			
			}
			else if(age>=60)
			{
				System.out.println("age is greater than 60");
				 price += (2500*0.6);
				System.out.println("price = "+price);
				
			}
			else if(gender=="f"||gender=="F"&& age>12 && age<60)
			{
				
				System.out.println("25% extra discount for females");
				{
					price+= 2500*0.25;
					System.out.println("price 25% off for female");
				}
				 
			}
			
			else
			{
				price+= 2500;
				 System.out.println("price="+price);
			}
			
			
			}
}


public class train {

	public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		  
		   System.out.println("Enter age");
              int age = sc.nextInt();
              System.out.println("enter gender if your age is in beetween 13 to 59 else type c for cancel");
              String gender=sc.next();
		   
              prices p = new prices();
              p.cal(age,gender);
	}

}
