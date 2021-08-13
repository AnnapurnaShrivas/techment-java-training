package com.techment.oppsassignment;

import java.util.Random;

abstract class Medicine2
{
	double price;
	String expDate;
	public Medicine2(double price, String expDate) {
		super();
		this.price = price;
		this.expDate = expDate;
	}
	
	abstract void displayLable();

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getExpDate() {
		return expDate;
	}

	public void setExpDate(String expDate) {
		this.expDate = expDate;
	}
	
	void getDetails()
	{
		System.out.println("Price = "+this.price);
		System.out.println("Expiry Date = "+this.expDate);
	}
	
}

class Tablet2 extends Medicine2
{

	public Tablet2(double price, String expDate) {
		super(price, expDate);
		
	}

	@Override
	void displayLable() {
		System.out.println("TABLET NEED TO STORE IN A DRY PLACE\n\n");
		
	}
}

class Syrup2 extends Medicine2
{

	public Syrup2(double price, String expDate) {
		super(price, expDate);
		
	}

	@Override
	void displayLable() {
		System.out.println("Not for children less than 2 years \n\n");
		
	}
}

class Ointment2 extends Medicine2
{

	public Ointment2(double price, String expDate) {
		super(price, expDate);
		
	}

	@Override
	void displayLable() {
		System.out.println("for external use only\n\n");
		
	}


	
}



public class TestMedicine2 {

	public static void main(String[] args) {
		 
		Medicine2[] medicineReference = new Medicine2[5];
		
		medicineReference[0] = new Tablet2(100.00,"12/10/2020");
		medicineReference[1] = new Syrup2(1000,"12/5/2021");
		medicineReference[2] = new Ointment2(1000,"12/11/2022");
		medicineReference[3] = new Tablet2(1000,"12/04/2023");
		medicineReference[4] = new Syrup2(1000,"12/05/2025");
		
		Random random = new Random();
		
		int n = random.nextInt(3);
		medicineReference[n].displayLable();
		medicineReference[n].getDetails();

	}

}
