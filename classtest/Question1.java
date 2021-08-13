package com.techment.classtest;

import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		
      int arr[]= new int[10];
      
      System.out.println("Enter the Age one by one");
      Scanner scanner = new Scanner(System.in);
      for( int i=0;i<10;i++)
      {
    	  arr[i]=scanner.nextInt();
      }
      int child=0;
      int adult=0;
      int senior=0;
      
     for(int i =0;i<10;i++)
      {
    	  if(arr[i]<18)
    		  child++;
    	   if (arr[i]>=18 && arr[i]<54)
    		  adult++;
    	  if(arr[i]>=55)
    		  senior++;
    	  
      }
      
     System.out.println("Children = "+child);
     System.out.println("Adult = "+adult);
     System.out.println("Senior Citizen = "+senior);
     
      
      
      
	}

}
