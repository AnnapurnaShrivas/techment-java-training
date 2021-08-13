package com.techment.abstraction;


abstract class Bank
{
	void Eligibility()
	{
		System.out.println("above 18 can open account");
	}
	
	abstract int rateOfInterest(int interestRate);
}


// when any class extends abstract class means , this(child class) class is responsible to 
//provide the body. It need to provide the implimentation for abstract method
class Axis extends Bank
{
	@Override
	int rateOfInterest(int interestRate)
	{
		System.out.println("Axis bank\n");
		return interestRate;
	}
}

class Kotak extends Bank
{
	@Override
	int rateOfInterest(int interestRate)
	{
		System.out.println("Kotak bank\n"+interestRate);
		return interestRate;
	}
}



public class AbstractionDemo {

	public static void main(String[] args) {
		
		Bank bank=new Kotak();
		System.out.println(bank.rateOfInterest(6));
		
		Bank bank2=new Axis();
		System.out.println(bank2.rateOfInterest(9));
		
	}

}
