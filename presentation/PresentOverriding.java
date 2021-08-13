package com.techment.presentation;


class Base
{
	  void show()
	 {
		 System.out.println("Base class Show()....");
		 
	 }
	
}
class Derived extends Base
{
	
	
	void show() 
		// Show() redefine
		{
			System.out.println("Derived class show ()....");
		}
}


public class PresentOverriding 


{
	public static void main(String az[])
	{
		Derived ob=new Derived();
		ob.show();
		
	}
}


