package Logic_building;
import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		int n,t;   
		Scanner sc= new Scanner(System.in);  
		System.out.print("Enter the number for table : ");
		n=sc.nextInt(); 
		System.out.print("Enter total multiplication no. u want : ");
		t=sc.nextInt();
		
		for(int i=1;i<=t;i++)
		{
			System.out.println(n+" * "+i+" = "+(n*i));
		}
		 
		
		

	}

}
