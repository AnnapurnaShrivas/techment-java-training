package Logic_building;

import java.util.Random;
import java.util.Scanner;

public class Exercise27 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int maxRange;

	       
	        Scanner SC = new Scanner(System.in);
	        Random rand = new Random();
	      
	       
	           int a = rand.nextInt(10);
	        int b = rand.nextInt(10);
	        if(a%2==0 && b%2==0) {
	        	int c = a+b;
	        	System.out.println("Even hence addition is = " +  c);
	        }
	        else {
	        	int c = a-b;
	        	System.out.println("Odd therefore  substraction is = " + c);
	        }
	        
	        
	}

}
