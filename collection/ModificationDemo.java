package com.techment.collection;

import java.util.ArrayList;

public class ModificationDemo {

	public static void main(String[] args) {
		
		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(154454);
		o2.add(243);
		o2.add(3543);
		o2.add(3);
		o2.add(5);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		for(int i:o2)
		{
			if(i>3)
			//	o2.add(100);     // give error
				o2.remove(i);   // give error
			
			//Because modification not supported
			
			System.out.println(i);
		}
	}
	
	

}
