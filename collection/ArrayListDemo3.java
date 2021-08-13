package com.techment.collection;

import java.util.ArrayList;

public class ArrayListDemo3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> o1= new ArrayList<Integer>();
		o1.add(1);
		o1.add(2);
		o1.add(3);
		o1.add(4);
		o1.add(5);
		o1.add(6);
		
		
		System.out.println("Element of obj o1 = "+o1);
		
		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(154454);
		o2.add(243);
		o2.add(3543);
		o2.add(3);
		o2.add(5);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		
		o2.addAll(o1);    // add 1 collection to another
		System.out.println("Element of obj o2 after addind o1 element = "+o2);
		
		//o2.removeAll(o1);     // remove o1 from o2
		//System.out.println("Element of obj o2 after Removing o1 element = "+o2);
		
		o2.retainAll(o1);   // remove common element

		System.out.println("retain element = "+o2);
	}

}
