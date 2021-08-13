package com.techment.oppsassignment.shape;

import java.util.Scanner;

public class Task1Square implements Task1Polygon {

	
	
	float side;
	Scanner sc = new Scanner(System.in);
	

	@Override
	public void calcArea() {
		System.out.println("Enter sides of square\n");
		side=sc.nextFloat();
		
		Float area=side*side;
		
		System.out.println("Area of Suqare is "+ area);
		
	}

	@Override
	public void calcPeri() {
		
		Float perimeter= 4*side; 
		System.out.println("Perimeter of Square is "+perimeter);
		
	}

}
