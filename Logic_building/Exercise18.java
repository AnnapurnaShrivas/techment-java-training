package Logic_building;
import java.util.Scanner;



public class Exercise18 {
 
	   public static void main(String[] args) {
		   int add=0;
	     Scanner scan = new Scanner(System.in);
	     System.out.println("Enter 1st value");
	     int a = scan.nextInt();
	     System.out.println("Enter 2nd value");
	     int b = scan.nextInt();
	    
	      try {
	    	  
	         add = b/a;
	      } catch (ArithmeticException e) {
	         e.printStackTrace();
	         System.out.println("Cannot divide by zero");
	      }
	      finally {
	          
	          System.out.println("executed");
	          
	      }
	      System.out.println(add);
	      
	   }
	}