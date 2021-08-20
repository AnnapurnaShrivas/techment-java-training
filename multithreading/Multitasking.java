package com.techment.multithreading;


class Sanika extends Thread
{
	public void run()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println("Sanika = "+i+"msg = welcome to Banglore");
		}
	}
}



class Parul extends Thread
{
	public void run()
	
	{
		for(int i=1;i<=5;i++)
		{
		      try
		      {
		    	 Thread.sleep(1000); 
		      }
		      catch(InterruptedException e)
		      {
		      System.out.println(e);
		      }
			
			System.out.println("Parul = "+i+"msg = take Vaccination");
			
		}
	}
}


class Amit extends Thread
{
	public void run()
	{
		for(int i=1;i<=5;i++)
		{
			System.out.println("Amit = "+i+"msg = Covid 19 is not over yet");
		}
	}
}


public class Multitasking {

	public static void main(String[] args) {
		
		Sanika sanika = new Sanika();
		Parul parul =new Parul();
		Amit amit = new Amit();
		
		
		//normal way of calling.... it will work sequencially(proccedural)
//		sanika.run();
//		parul.run();
//		amit.run();
		
		
		// multithreading call .... parellaly they will work
		sanika.start();
		parul.start();
		amit.start();
		
		
		

	}

}
