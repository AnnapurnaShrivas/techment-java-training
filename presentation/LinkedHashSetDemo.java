package com.techment.presentation;

import java.util.LinkedHashSet;

public class LinkedHashSetDemo {


		public static void main(String[] args) {
			
			LinkedHashSet h = new LinkedHashSet();
			h.add("B");
			h.add("C");
			h.add("V");
			h.add("K");
			h.add("Z");
			h.add(null);
			h.add("10");
			System.out.println(h.add("a"));
			System.out.println(h.add("V"));
			System.out.println(h);

		}

	}
	

