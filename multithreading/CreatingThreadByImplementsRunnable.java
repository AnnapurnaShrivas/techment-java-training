package com.techment.multithreading;

class Info implements Runnable
{
     public void run()
     {
    	 System.out.println("this is my runnable task");
     }
}


public class CreatingThreadByImplementsRunnable {

	public static void main(String[] args) {
	
		Info info = new Info();
         Thread thread = new Thread(info);
         thread.start();
	}

}
