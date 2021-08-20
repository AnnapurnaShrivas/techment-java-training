package com.techment.multithreading;

class Apple extends Thread
{
     public void run()
     {
    	 for(int i = 1;i<=5;i++)
    	 {
    		 
//    		 if (i==2)
//    		 {
//    			 stop();    // it will dead the method
//    		 }
    	 System.out.println("eat apple = "+ Thread.currentThread().getName());
    	 
//    	 + Thread.currentThread().getName()................. it says thatwhich thread is currently running
    	 }
     }
}



class Banana extends Thread
{
    public void run() {
    	for(int i = 1;i<=5;i++)
		System.out.println("eat banana = "+ Thread.currentThread().getName());
	}	
}
public class ThreadNaming {

	public static void main(String[] args) {
		
		
		System.out.println("Main thread\n");

		Apple apple = new Apple();
		Banana banana = new Banana();
		
		
		// by default the thread name as 0 1 2 3 4 ... 
		//bt if we want to name the thread that we can do this
		apple.setName("Apple Thread");
		banana.setName("Banana Thread");
		
		// seting the priority value
		apple.setPriority(8);
		banana.setPriority(1);
		
		apple.start();
		banana.start();
		
		
		// to make the thread in deadlock condition
//		banana.suspend();
		
		// to again resume it from dead lock
//		banana.resume();
	}

}
