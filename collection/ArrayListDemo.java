package com.techment.collection;

import java.util.ArrayList;

// Basi concept of arraylist .... Dymanic array

public class ArrayListDemo {

	public static void main(String[] args) {
		
		
        ArrayList obj = new ArrayList();
        System.out.println("Size of element before adding the element = "+obj.size());
        obj.add(1);        // automatically 1 will convert into object
        
        obj.add("annu");
        obj.add(23.43);
        System.out.println("Size of element after adding the element = "+obj.size());
        System.out.println(" element is the list = "+obj);
        
        obj.add(1,"Hello");
        System.out.println("adding  the  element  index 1= "+obj);
        
        obj.remove(1);      // taking index no....... it is an interger
        System.out.println("Removing element in index no. 1 only = "+obj);
        
        obj.remove(Integer.valueOf(1));
        System.out.println("After remove 1 = "+obj);
        
        System.out.println(" Element in index no. 1 = "+obj.get(1));
	}

}
