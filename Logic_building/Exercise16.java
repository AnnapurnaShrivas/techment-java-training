package Logic_building;
import java.util.Scanner;

public class Exercise16 {

	public static void main(String[] args) {
		int num;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number to check the divisiblity bt 8 and 3 : ");   
		num=sc.nextInt(); 
		
		if (num%8==0)
		{
			if(num%3==0)
			{
				System.out.println("Number entered is dvisible by 8 and 3");
			}
		}
		else
			System.out.println("Number entered is not dvisible by 8 and 3");
	}

}
