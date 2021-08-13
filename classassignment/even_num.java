package com.techment.classassignment;

public class even_num {

	public static void main(String[] args) {
		
		//to print Even no.
	
		for(int i=0;i<=20;i++)
		{
			if(i%2==0)
			System.out.println(i);
		}
		
		//to print no. from 10 - 1
		
		for(int i=10;i>=1;i--)
		{
			System.out.print(i+", ");
		}
		
		// sum of 1st 10 no.
		System.out.println();
		int temp=0;
		for(int i=1;i<=10 ;i++ )
		{
			
			temp=temp+i;
			
		}
		System.out.println(temp);
		
		
		
			
			

	}

}
