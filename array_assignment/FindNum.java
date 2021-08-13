package com.techment.array_assignment;

import java.util.Scanner;
public class FindNum {
	   public static void main(String args[]){
	      int[] myArray =  {1,4,34,56,7};
	      
	      Scanner sc= new Scanner(System.in);
	      System.out.println("Enter Num to search in array\n");
	      int num = sc.nextInt();

	      for(int i = 0; i<myArray.length; i++){
	         if(num == myArray[i]){
	            System.out.println("Array contains the given element On index value = "+i);
	         }
	         else
	         {
	          System.out.println("1== not found\n");
	         
	         }
	     
	      }
	     
	        	
	   }
	}
