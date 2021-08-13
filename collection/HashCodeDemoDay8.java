package com.techment.collection;

public class HashCodeDemoDay8 {

	public static void main(String[] args) {
		
		String a="hello";
		String b="hello";
		String  c = "java";
		Integer x=45;         // for integer .. it will show the value only
		Double y=4.5;
		
		System.out.println(a.hashCode());
		// hasCode() show  uniquacally identify no.

		
		System.out.println(b.hashCode());
		System.out.println(c.hashCode());
		
		System.out.println(x.hashCode());
		System.out.println(y.hashCode());
	}

}
