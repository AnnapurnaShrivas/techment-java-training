package com.techment.classassignment;

import java.util.Scanner;

public class ArrayDemo {

	public static void main(String[] args) {
	    int marks[]= new int[10];
	    int i,total,max1,max2,low;
	    		
	    		Scanner scanner= new Scanner(System.in);  
		System.out.print("How many marks you want to enter: ");  
		int n=scanner.nextInt();  
		
		for(i=0;i<n;i++)
		{
			System.out.println("Enter the "+(i+1)+ " marks");
			marks[i]=scanner.nextInt();
		}
		
		
		System.out.println("Your entered marks are====");
		for(i=0;i<10;i++)
		{
			System.out.println((i+1)+" = "+marks[i]);
		}
		
		
	    total=0;
		for(i=0;i<n;i++)
		{
			total+=marks[i];
		}
		System.out.println("\nTotal Average marks is == "+total);
		
		max1=0;
		max2=0;
		low=0;
		for(i=0;i<n;i++)
		{
			if(max1 <= marks[i])
				max1 =marks[i];
			
			if(max2<=marks[i] && marks[i]!=max1 && max2>low)
				max2=marks[i];
				
			if(low >= marks[i])
				low=marks[i];
		
		}
			System.out.println("\nHighest marks is = "+max1);
			System.out.println("\n2nd Highest marks is = "+max2);
			System.out.println("\nLowest marks is = "+low);

			
			System.out.println("Result are here=====");
			for(i=0;i<n;i++)
			{
				if(marks[i]>= 40)
					System.out.println((i+1)+" is PASS with "+marks[i]+" marks");
				else
					System.out.println((i+1)+" is FAIL");
			}
			
	}

}
