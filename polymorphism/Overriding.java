package com.techment.polymorphism;


class Bank
{
	public void rateOfInterest()
	{
		System.out.println(" 3% ");
	}
	
	public void openAccount()
	{
		System.out.println(" above 18 can apply for new Account ");
	}
}

class SBI extends  Bank
{
	@Override                        // it showing that this is overriden ... it will not 
	// check the base class
	public void rateOfInterest()             // public is must here
	{
		System.out.println(" 5% ");
	}
	
	/*public static rateOfInterest()             // static will never be override
	{
		System.out.println(" 5% ");
	}
	*/
	
	public void loan()
	{
		System.out.println("You can apply for loan");
	}
}

class Axis extends  Bank
{
	/*public void rateOfInterest()
	{
		System.out.println(" 3% ");
	}
	*/
}

public class Overriding {

	public static void main(String[] args) {
		
       SBI sbi = new SBI();
       Axis axis= new Axis();
       
       //sbi.rateOfInterest();
       //sbi.loan();
       //axis.rateOfInterest();
       
       Bank bank = new SBI();            // UPCASTING== it will create child obj but referce to base
       //losly coupled.. it is used when we oveerride
       
       bank.rateOfInterest();         // it will show 5%
       //bank.loan();   // we can not access loan method
       
       bank.openAccount();
       
       // also applicable 
	}

}
