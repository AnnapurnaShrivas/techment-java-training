package com.techment.oppsassignment;

import java.util.Scanner;

abstract class PrepaidCard
{
	int cardNo;
	double availableBalance;
	double swipeLimit;
	
	 abstract boolean swipeCard();
	


void rechargeCard()
{
	Scanner sc = new Scanner(System.in);
	double amount = sc .nextDouble();
	
	amount = amount+availableBalance;
}
}

public class TestCard {

	boolean swipeCard()
	{
		Scanner sc = new Scanner(System.in);
		boolean b= sc.nextBoolean();
		return b;
		
	}
	
	
	@Override
	public String toString() {
		return "TestCard [swipeCard()=" + swipeCard() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	


	public static void main(String[] args) {
		

	}

}
