package com.techment.Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Input {

	
	public static void main(String[] arg)
	{
		Scanner sc= new Scanner(System.in);
		
		try
		{
		System.out.println("Enter no1.");
		
		int num1=sc.nextInt();
		
System.out.println("Enter no2.");
		
		int num2=sc.nextInt();
		
			int result= num1/num2;
			System.out.println("Result = "+result);
		}
		
		catch(ArithmeticException ae)
		{
		 System.out.println("Arithmetic Exeption");	
		 
		}
		
		
		catch(InputMismatchException ie)
		{
		 System.out.println("Input Mismatch Exeption");	
		 
		}
		
		
		
		
		
	}
}
