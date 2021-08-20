package com.techment.multithreading;

class Message extends Thread
{
     public void run()
     {
    	 System.out.println("this is my task");
     }
}

class CreatingThreadByExtendsThread {

	public static void main(String[] args) {
		
		
		Message message = new Message();
		message.start();
		

	}

}
