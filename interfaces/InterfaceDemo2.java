package com.techment.interfaces;

interface Bank1
{
void rateOfInterest();
}

class Axis1 implements Bank1
{
	@Override
	public void rateOfInterest()
	{
		System.out.println(" Axis bank 5%");
	}
	}

class Kotak1 implements Bank1
{
	@Override
	public void rateOfInterest()
	{
		System.out.println("8%");
	}
	}



public class InterfaceDemo2 {

	public static void main(String[] args) {
	
		Bank1 bank1= new Axis1();
		bank1.rateOfInterest();
		
		Bank1 bank2= new Kotak1();
		bank2.rateOfInterest();

	}

}
