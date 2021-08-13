package com.techment.collection;

import java.util.ArrayList;
import java.util.ListIterator;

//ListIterator

public class IteratorDemo2 {

	public static void main(String[] args) {
		

		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(154454);
		o2.add(243);
		o2.add(3543);
		o2.add(3);
		o2.add(5);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		ListIterator<Integer> itr = o2.listIterator();
System.out.println("forward direction");
		
		while(itr.hasNext())   // 
		{
			System.out.println(itr.next());
			
			
		
		System.out.println("backward direction");
		
		while(itr.hasPrevious())   // 
		{
			System.out.println(itr.previous());
		}
	}

}
}
