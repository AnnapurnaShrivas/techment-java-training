package com.techment.oppsassignment.test;


import com.techment.oppsassignment.shape.Task1Rectangle;
import com.techment.oppsassignment.shape.Task1Square;

public class Shape {

	public static void main(String[] args) {
		
		Task1Square task1Square = new Task1Square();
		task1Square.calcArea();
		task1Square.calcPeri();
		
		Task1Rectangle task1Rectangle  =new Task1Rectangle();
		task1Rectangle.calcArea();
		task1Rectangle.calcPeri();

	}

}
