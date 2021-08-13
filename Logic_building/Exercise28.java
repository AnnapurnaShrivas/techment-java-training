package Logic_building;

import java.util.Scanner;

public class Exercise28 {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		while(true) 
		{
		Scanner scanner = new Scanner(System.in);
		System.out.print("\nEnter your pin =  ");
		int pin = scanner.nextInt();
		
		if(pin==12345)
		break;
		else
			System.out.println("\nyou entered wrong pin number Please enter again = ");
		}
		
		System.out.println("\nCongrats your pin is correct");
		
	}
}
