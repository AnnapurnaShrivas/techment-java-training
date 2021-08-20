package com.techment.multithreading.interthread;

public class Account {

	int balance = 0;
	
	synchronized public int withdraw(int amount) {
		if(amount>balance)
		{
			try
			{wait();         // critical code
			}
			catch(InterruptedException e)
			{
				e.printStackTrace();
			}
		}
		
		System.out.println(Thread.currentThread().getName()+ " is goint to withdraw");
		balance -=amount;          // balance = balance - amount
		return balance;
	}
	
    synchronized public int deposite(int amount) {
		
    	System.out.println(Thread.currentThread().getName()+ " is goint to ");
		balance +=amount;
		return balance;
	}
	
}
