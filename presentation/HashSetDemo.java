package com.techment.presentation;

import java.util.HashSet;

public class HashSetDemo {

	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		h.add("B");
		h.add("C");
		h.add("V");
		h.add("K");
		h.add("Z");
		h.add("10");
		System.out.println(h.add("a"));
		//System.out.println(h.add("V"));
		System.out.println(h);

	}

}
