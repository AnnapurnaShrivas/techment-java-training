package com.techment.classtest2;


import java.util.Scanner;

public class Question4 {

	public static void main(String[] args) {
		
		System.out.println("Enter Your choice for Red/Yellow/Green\n ");
		Scanner scanner = new Scanner(System.in);
		String choice = scanner.next();
		
		switch(choice)
		{
		case "red":
		case "r":
		case "R":
			System.out.println("STOP");
			break;
		
			
		case "yellow":
		case "y":
		case "Y":
			System.out.println("READY");
			break;
			
			
		case "green":
		case "g":
		case "G":
			System.out.println("GO");
			break;
			
		default:
			System.out.println("Wrong Choice");
		}
		
    
	}

}
