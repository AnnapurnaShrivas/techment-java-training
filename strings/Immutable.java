package com.techment.strings;

public class Immutable {

	public static void main(String[] args) {
	
		String course="java";
		System.out.println("course name = "+course);
		
		// course.concat(programming);   // cannot be concate.. because u can not modify the value
		
		System.out.println("affter concate "+course);
		
		course=course.concat(" language");
		
		System.out.println(course);
	}

}
