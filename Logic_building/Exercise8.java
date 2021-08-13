package Logic_building;

import java.util.Scanner;

public class Exercise8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		System.out.println("enter to check Armstrong");
		
		Scanner scanner = new Scanner(System.in);
		int num = scanner.nextInt();
		int num2 = num;
		while(num>0) {
			int lastDigit = num%10;
			sum = sum + (lastDigit*lastDigit*lastDigit);
			num = num/10;
		}
		if(num==num2) {
			System.out.println("it is armstrong num");
		}
		else {
			System.out.println("not");
		}
	}

}

