package com.techment.multithreading;

class Water
{
	synchronized public void drinkWater(int time) {
		// on adding synchorized .. it will go only one by one... otherwise it will run paralally
		for(int i = 1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is drinking water  "+i+" times");
		}
		
		for(int i = 1;i<=time;i++)
		{
			System.out.println(Thread.currentThread().getName()+" is eating  "+i+" times");
		}
		
		
	}
}


class WaterBottle extends Thread
{
	Water water = new Water();
	
	
	@Override
	public void run() {
		// in run method .. we will keep the task
		water.drinkWater(5);
	}
}

public class SynchronizationDemo {

	public static void main(String[] args) {

		WaterBottle bottle = new WaterBottle();
		
		Thread person1 = new Thread(bottle);
		Thread person2 = new Thread(bottle);
		Thread person3 = new Thread(bottle);
		
		
		person1.setName("annpurna");
		person2.setName("aaisha");
		person3.setName("arun");

		person1.start();
		person2.start();
		person3.start();
		
		
	}

}
