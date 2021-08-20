package com.techment.multithreading.interthread;

public class InterThreadCommunication {

	public static void main(String[] args) {
		
		Account account = new Account();
		
		Thread t1 = new Thread()
				{
			      public void run() {
					System.out.println(" after withdraw balance = "+account.withdraw(2000));
				}
				};
				
	   Thread t2 = new Thread()
				{
			      public void run() {
			    	  System.out.println(" after deposit balance = "+account.deposite(3000));
				}
				};
				
				t1.setName("ATM");
				t2.setName("BANK");
				
				t1.start();
				t2.start();
				
	}

}
