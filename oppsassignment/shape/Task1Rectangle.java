package com.techment.oppsassignment.shape;

import java.util.Scanner;

public class Task1Rectangle implements Task1Polygon {

	
		float length;	
        float breadth;
        
        Scanner sc=new Scanner(System.in);
	
	@Override
	public void calcArea() {
      
		System.out.println("\n\nEnter Length and Breadth\n");
		length = sc.nextFloat();
		breadth = sc.nextFloat();
		
		float area= length*breadth;
		System.out.println("Area of Rectangle is " +area);
		
		

		
	}

	@Override
	public void calcPeri() {
		
		
		float perimeter= 2*length+2*breadth;
		System.out.println("Perimeter of Rectangle is " +perimeter);
		
		
	}

}
