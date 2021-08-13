package com.techment.classassignment;



class Parent 
{
	int a=100;
	}

class Child extends Parent
{
	int a=20;
	
	void sum()
	{
		int a=10;
		
		int c=a+a;
		System.out.println("Sum C = "+c);
		
		int d=this.a+a;                 //this representing the current object
		System.out.println("Sum D = "+d);
		
		int e=super.a+a;
		System.out.println("Sum E= "+e);
		
		int f=super.a+this.a+a;
		System.out.println("Sum F= "+f);
	}
	}

public class SuperVeriableDemo {

	public static void main(String[] args) {
		
		Child child=new Child();
		child.sum();
		
	}

}
