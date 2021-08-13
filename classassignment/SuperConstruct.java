package com.techment.classassignment;




class Parent1
{
	int a;
     Parent1(int a)                      // Default Constructor Called automatically bt for Paramerrized Constructor , we have to call it externally
     {
    	 System.out.println("This is Parent class"+a);
     }
}

class Child1 extends Parent1
{
        Child1(int x)
        {
        	super(x);                      // calling paramerized parent class
        	System.out.println("This is Child class");
        }
}

public class SuperConstruct {

	

	public static void main(String[] args) {
		
		Child1 child1= new Child1(6);
			}

}



