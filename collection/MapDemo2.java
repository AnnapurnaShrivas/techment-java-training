package com.techment.collection;

import java.util.HashMap;
import java.util.Map.Entry;


public class MapDemo2 {

	public static void main(String[] args) {
		

		HashMap<String,String> hm = new HashMap<String,String>();
		hm.put("1","455");
		hm.put("2","3243.43");
		hm.put("3","annu");
		hm.put("4","priya");
		hm.put("5","a");
		hm.put("3","annapurna");       // 3 is over right .. annu to annapurna  
		
		System.out.println("HashMap String type = "+hm);
		
		
		
		for(Entry<String, String> e :hm.entrySet())
		{
			System.out.println(e);
			System.out.println("key = "+e.getKey());
			System.out.println("value = "+e.getValue());
		}

		System.out.println("\n\nPrinting values");
		for (String val :hm.values())
		{
			System.out.println(val);
		}
		
		System.out.println("Printing keys");
		for (String key :hm.keySet())
		{
			System.out.println(key);
		}
		
		
	}

}
