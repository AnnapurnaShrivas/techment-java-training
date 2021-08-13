package com.techment.interfaces;

interface One 
{
void greet();
}

interface two
{
	void greet();
	}

class Manager
{
  void operation()
  {
	  
  }
}

class Employee2 extends Manager implements One,two        // in order 1.extends 2.implements

{
	@Override
	public void greet()
	{
		
	}
}

public class InterfaceDemo3 {

	public static void main(String[] args) {
		
	}

}
