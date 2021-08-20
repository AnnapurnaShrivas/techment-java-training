package com.techment.classtest2;

public class Question2 {
	
	public  String repeat(String str , int n)
	 {
		 
		 String word = str.substring(str.length()-n);
		 
		 for(int i =n;i<n;n++)
		 {
			 word = word+str.substring(str.length()-n);
		 }
		 
		 return word;
	 }

	public static void main(String[] args) {
		
		Question2 question2= new Question2();
		System.out.println(question2.repeat("Hello",3));
		System.out.println(question2.repeat("Hello",2));
		System.out.println(question2.repeat("Hello",1));
	}

}
