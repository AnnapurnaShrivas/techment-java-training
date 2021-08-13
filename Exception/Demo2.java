package com.techment.Exception;



public class Demo2 {

	public static void main(String[] args) {
		
		System.out.println("My name is Annapurna ");
		System.out.println("Email is annapurna@gmail.com");
		int arr[]=new int[5];
		
		try
		{
		   System.out.println(2/1);  
		   // generate exception.. and ones the exception comes then is abnormally terminatied
		
		    arr[7]=34;
		   
		System.out.println(8/2);
		}
		
		catch(ArithmeticException e)    // we can not give different Exception here ...
		// or we can give parent class ie exeption
		{
			System.out.println("Divide bt 0 which is not possible");
		}
		           
		catch(ArrayIndexOutOfBoundsException e)    // we can use multiple catch block also
		{
			System.out.println("Out of Index");
		}
		
		catch(Exception e)
		{
			System.out.println("Some thing is wrong");
		}
		
		
		
		System.out.println("Contact 0987654321");
		System.out.println(1+2);          // shoes value
		

	}

}

