package Logic_building;

import java.util.Scanner;
import java.lang.Math;

public class Exercise44 {
	
	int lenght,base,height;
	double answer,s;
	
	void calculate(int lenght,int base,int height)
	{
		s=((lenght+base+height)/2);
		answer=Math.sqrt(s*(s-lenght)*(s-base)*(s-height));

		     System.out.print("Area of a triangle using heron's Formula is \n"+answer);
	}

	public static void main(String[] args) {
	     Scanner scanner= new Scanner(System.in);
	     System.out.println("Enter the value of 3 sides of a Triangle\n\n ");
	     System.out.println("Enter the value of lenth of a triangle");
	     int lenght=scanner.nextInt();
	     System.out.println("Enter the value of base of a triangle");
	     int base=scanner.nextInt();
	     System.out.println("Enter the value of height of a triangle");
	    int  height=scanner.nextInt();
	    
	    Exercise44 exercise44=new Exercise44();
	    exercise44.calculate(lenght,base,height);
	     
	  
	}

}
