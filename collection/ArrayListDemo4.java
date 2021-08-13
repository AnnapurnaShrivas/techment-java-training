package com.techment.collection;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListDemo4 {

	public static void main(String[] args) {
		
		
		ArrayList<Integer> o2= new ArrayList<Integer>();
		o2.add(154454);
		o2.add(243);
		o2.add(3543);
		o2.add(3);
		o2.add(5);
		
		
		
		System.out.println("Element of obj o2 = "+o2);
		
		Collections.sort(o2);
		
		System.out.println("Element After sorting = "+o2);
		
	}

}
