package Logic_building;

/*print
 * 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
*/
import java.util.Scanner;

public class Exercise35
{
    public static void main(String[] args)
    {
        // Create a new Scanner object
        Scanner scanner = new Scanner(System.in);
        // Get the number of rows from the user
        System.out.println("Enter the number of rows to print the pattern ");
        int rows = scanner.nextInt();

        
        for (int i = 1; i <= rows; i++)
        {
            for (int k = 1; k <= i; k++)
            {
                System.out.print(k + " ");
            }
           
            System.out.println();
        }

        for (int i = rows - 1; i >=1; i--)
        {
        	for(int j = 1; j <= rows; j++)
        	{
            for (int k = i; k >= 1; k--)
            {
                System.out.print((j++)+ " ");
            }
        
            break;
        	}
            System.out.println();
        }
    }
}

