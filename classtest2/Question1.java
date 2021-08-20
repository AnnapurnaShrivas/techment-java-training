package com.techment.classtest2;

public class Question1 {

	
	
		
		public  String repeat(String str , int n)
		 {
			 int lenght = str.length();
			 
			 String word = "";
			 
			 for(int i =n;n>0;n--)
			 {
				 word = word+str.substring(0, n);
			 }
			 
			 return word;
		 }

	
	public static void main(String[] args) {

		Question1 question1= new Question1();
		System.out.println(question1.repeat("Chocolate",4));
		System.out.println(question1.repeat("Chocolate",3));
		System.out.println(question1.repeat("Chocolate",2));
}
}
