package Logic_building;

import java.util.Scanner;
public class Exercise5 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your bday month");
		int a = scan.nextInt();
		String [] month = {"JANUARY", "FEBRUARY", "MARCH", "APRIL", "MAY", "JUNE", "JULY", "AUGUEST", "SEPTEMBER", "OCTOBER", "NOVEMBER", "DECEMBER"};
		
		System.out.println(month[a-1]);
		
	}
}
