package Logic_building;
import java.util.Scanner;

public class Exercise9 {

	public static void main(String[] args) {
		
		int num,result;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number: ");  
		//reads the limit from the user  
		num=sc.nextInt(); 
		for(int i=1;i<=num;i++)
		{
			result =i*i*i;
			System.out.print(" "+result);
		}

	}

}
