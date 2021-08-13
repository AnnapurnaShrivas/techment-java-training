package com.techment.collection;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {

	public static void main(String[] args) {

		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(154454);
		o2.add(243);
		o2.add(3543);
		o2.add(3);
		o2.add(5);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		Iterator<Integer> itr = o2.iterator();   // forward direction
		
		
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
	}

}
