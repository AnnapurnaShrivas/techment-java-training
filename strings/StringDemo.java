package com.techment.strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String s1="Hello";
		String s2="Hello";// by Literal
		
		String  s3 = new String("Hello");   // by new Keyword
		String  s4 = new String("Hello");
		
		
		System.out.println("s1 = "+s1.hashCode());
		System.out.println("s2 = "+s2.hashCode());
		System.out.println("s3 = "+s3.hashCode());
		System.out.println("s4 = "+s4.hashCode());
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		
		System.out.println(s3==s4);
		System.out.println(s3.equals(s4));
		
		

	}

}
