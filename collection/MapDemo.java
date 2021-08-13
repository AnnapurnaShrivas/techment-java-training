package com.techment.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;

public class MapDemo {

	public static void main(String[] args) {
		

		
		HashMap hs = new HashMap();
		hs.put(1,455);
		hs.put(2,3243.43);
		hs.put(3,"annu");
		hs.put(4,"priya");
		hs.put(5,"a");
		hs.put(3,"annapurna");       // 3 is over right .. annu to annapurna  
		
		System.out.println("HashMap = "+hs);
		
		
		
		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1","455");
		hm.put("2","3243.43");
		hm.put("3","annu");
		hm.put("4","priya");
		hm.put("5","a");
		hm.put("3","annapurna");       // 3 is over right .. annu to annapurna  
		
		System.out.println("HashMap String type = "+hm);
		
		LinkedHashMap lh = new LinkedHashMap();    // maintain insersion order
		lh.put(1,43);
		lh.put(2,67);
		lh.put(3,67);     // duplicate also removes
		lh.put(4,67);
		lh.put(5,67);
		lh.put(6,"sachin");
		
		System.out.println("LinkedHashset = "+lh);
		
		
		
		TreeMap ts = new TreeMap();    /// default natural sorting
		
		ts.put(1,3);
		ts.put(2,342);
		ts.put(3,43);
		ts.put(4,534);
		ts.put(5,6334);
		ts.put(6,4);
		//ts.put(7,"sachin")          // ... its showing error ,it can not compare string with integer
		
		
		System.out.println("treeMap = "+ts);
	}

}
