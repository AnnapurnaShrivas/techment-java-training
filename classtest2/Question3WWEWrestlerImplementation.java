package com.techment.classtest2;
//myassignmenttrack@gmail.com


///////QUESTION no. 3



import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;


 class WWE {
   
	
	
	private String firstName;
	private String lastName;
	private int weight;
	public WWE(String firstName, String lastName, int weight) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.weight = weight;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}

	

}


public class Question3WWEWrestlerImplementation {

	public static void main(String[] args) {
	
		ArrayList<WWE> wwes = new ArrayList<WWE>();

		wwes.add(new  WWE("Hemraj", "Shrivas", 100));
		wwes.add(new  WWE("Ankit", "Singh", 130));
		wwes.add(new  WWE("Anuj", "Singh", 190));
		wwes.add(new  WWE("Aaiwary", "Singh", 200));
		wwes.add(new  WWE("Anirudh", "Singh", 235));
		wwes.add(new  WWE("Aakash", "Singh", 270));

		// a)count the number of wrestlers
		long c =wwes.stream().count();
		System.out.println(c);
	
		//b)sum of all weight of all wrestlers whose weight is above 200
		long sum = wwes.stream().filter(p -> (p.getWeight() > 200)).collect(Collectors.summarizingInt(WWE::getWeight)).getSum();
	    System.out.println(sum);
	    
	    // c) create a method printFirstName(List <WWE> list) that returns the first name of the all wrestler
	   wwes.stream().forEach(p -> System.out.println(p.getFirstName()));
	    
	    //d)write a method to find minimum weight of the wrestler.
	    long min = wwes.stream().collect(Collectors.summarizingInt(WWE::getWeight)).getMin();
	    System.out.println(min);

	}

}

