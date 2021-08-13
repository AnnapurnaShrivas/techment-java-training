package com.techment.Exception;

public class Demo1 {

	public static void main(String[] args) {
		
		System.out.println("My name is Annapurna ");
		System.out.println("Email is annapurna@gmail.com");
		
		
		try
		{
		   System.out.println(2/0);       // generate exception.. and ones the exception comes then is abnormally terminatied
		}
		
		catch(ArithmeticException e)    // we can not give different Exception here ...
		// or we can give parent class ie exeption
		{
			System.out.println("Divide bt 0 which is not possible");
		}
		
		
		
		System.out.println("Contact 0987654321");
		System.out.println(1+2);          // shoes value
		

	}

}
