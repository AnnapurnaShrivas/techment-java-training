package com.techment.array_assignment;

import java.util.Scanner;

public class AddMatrics {
	
	public static void main(String args[]) {

		int a[][] = new int[3][3];
		int b[][] = new int[3][3];
		
		int c[][] = new int[3][3];
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter for 1st matrics\n");
	        for (int i = 0; i < 3; i++) {
	            for (int j = 0; j < 3; j++) {
	               a[i][j]=sc.nextInt();
	            }
	        }
	            
	           System.out.println("Enter for 2st matrics\n");
		        for (int k = 0; k < 3; k++) {
		            for (int j = 0; j < 3; j++) {
		               b[k][j]=sc.nextInt();
		            }
		        }
	  
	            System.out.println();
	        
	    

  

    
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
			
				c[i][j] = a[i][j] + b[i][j]; 
				System.out.print("Addition of matrics = "+c[i][j] + "   ");
			}
			System.out.println("\n");
		}
	}
}

