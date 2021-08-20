package com.techment.classtest2;

import java.util.ArrayList;
import java.util.List;

public class Question7 {

 
 public static List[] divide(List<Integer> list)
 {
 
     List<Integer> first = new ArrayList<Integer>();
     List<Integer> second = new ArrayList<Integer>();


     int size = list.size();

    
     for (int i = 0; i < size / 2; i++)
         first.add(list.get(i));

     for (int i = size / 2; i < size; i++)
         second.add(list.get(i));

  
     return new List[] { first, second };
 }

	public static void main(String[] args) {
	
		List<Integer> list = new ArrayList<Integer>();

		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		list.add(8);
		list.add(9);
		list.add(10);
		list.add(11);

		// call split method which return List of array
		List[] lists = divide(list);

		System.out.println(lists[0]);
		System.out.println(lists[1]);
	}
}

