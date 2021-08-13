package com.techment.collection;
import java.util.ArrayList;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		
		ArrayList a1 =new ArrayList();   // can store any type of object
		a1.add(1);
		a1.add("Annu");
		
		ArrayList<Integer> a2 =new ArrayList<Integer>();   // it can store integer type only
		a2.add(1);
		// a2.add("sdfghjk");     // error .. because it can store only integer
		
		
		ArrayList<String> a3 =new ArrayList<String>(100);   // it can store String type only
		// and it has initial value is 100 ... after this .. it will use the formula
		// a3.add(1);       // error .. because it can store only string
		 a3.add("sdfghjk");    
		
		
		
	}

}
