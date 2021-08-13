package com.techment.collection;

import  java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class SetDemo {

	public static void main(String[] args) {
		
		HashSet hs = new HashSet();
		hs.add(1);
		hs.add(6);
		hs.add(3);
		hs.add(7);
		hs.add(11);
		hs.add(26);
		
		System.out.println("Hashset = "+hs);
		
		LinkedHashSet lh = new LinkedHashSet();    // maintain insersion order
		lh.add(43);
		lh.add(67);
		lh.add(67);     // duplicate also removes
		lh.add(67);
		lh.add(67);
		lh.add("sachin");
		
		System.out.println("LinkedHashset = "+lh);
		
		
		
		TreeSet ts = new TreeSet();    /// default natural sorting
		
		ts.add(3);
		ts.add(342);
		ts.add(43);
		ts.add(534);
		ts.add(6334);
		ts.add(4);
		//ts.add("sachin")          // ... its showing error ,it can not compare string with integer
		
		
		System.out.println("treeset = "+ts);
		

	}

}
