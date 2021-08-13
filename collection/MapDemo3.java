package com.techment.collection;

import java.util.HashMap;
import java.util.Map.Entry;

public class MapDemo3 {

	public static void main(String[] args) {
		
		Student student1 = new Student(1, "Sachin", 10);
		Student student2 = new Student(1, "Sachin", 10);

		System.out.println(student1.hashCode());
		System.out.println(student2.hashCode());
		// content in both the class 
		
		HashMap<Student,String> hm = new HashMap<Student,String>();
		hm.put(new Student(1,"Sachin",19),"EC");
		hm.put(new Student(1,"Sachin",19),"EC");
		
//		System.out.println("hashMap "+hm);
		
		for(Entry<Student,String> stu : hm.entrySet())
		{
			System.out.println(stu);
		}
	}

}
