package com.techment.classtest2;

// QUESTION NO. 6

import java.util.Scanner;

class AgeException extends Exception {

	public AgeException(String str) {
		System.out.println(str);
	}
}

class NameException extends Exception {

	public NameException(String msg) {
		System.out.println(msg);
	}
}

public class Question6Person {

	public static void main(String[] args) {

		int id, age;
		String name;

		// taking age as input
		Scanner s = new Scanner(System.in);
		System.out.print("Enter ur age = ");
		age = s.nextInt();

		// taking name as input
		System.out.print("Enter ur Name = ");
		name = s.next();

		try {
			if (age < 15)
				throw new AgeException("Invalid age, age must be above 15");
			else
				System.out.println("Valid age");
		} catch (AgeException a) {
			System.out.println(a);
		}
		try {
			if (name.length() < 3)
				throw new NameException("Must enter valid name ");
			else
				System.out.println("Valid Name ");

		}

		catch (NameException n) {
			System.out.println(n);
		}

	}
}
