package Logic_building;
import java.util.Scanner;

public class Exercise34 {
	  public static void main(String[] args)
	    {
	        // Create a new Scanner object
	        Scanner scanner = new Scanner(System.in);
	        // Get the number of rows from the user
	        System.out.println("Enter the number ");
	        int rows = scanner.nextInt();

	        for (int i = 1; i <= rows; i++) 
	        { 
	            for (int j = rows; j >= i; j--)
	            {
	                System.out.print(j+" ");
	            }
	             
	            System.out.println();
	        }

}
}
