package com.techment.classassignment;

public class pattern {

	public static void main(String[] args) {
	    // pattern 1
		/*
 * 
 *  * 
 *  *  * 
 *  *  *  * 
 *  *  *  *  *
		 */
		System.out.println("Pattern TRIANGLE PATTERN------------------------");
		for (int i = 1; i<=5;i++)
		{
			for(int j =1; j<=i;j++)
			{
			 System.out.print(" * ");
			}
			System.out.println();
			System.out.println();
		}
		
		
		System.out.println("Pattern 2 NUMBER PATTERN------------------------");
		/*
1 

1 2 

1 2 3 

1 2 3 4 

1 2 3 4 5
		 */
		for (int i = 1; i<=5;i++)
		{
			for(int j =1; j<=i;j++)
			{
			 System.out.print(j+" ");
			}
			System.out.println();
			System.out.println();
		}
		
		
		System.out.println("Pattern 3 TRIANGLE PATTERN  IN SEQUENCIAL NUMBERS -------------------");
		/*
1  
2  3  
4  5  6 
7  8  9  10
		 */
		int value=1;
		for (int i = 1; i <= 3; i++) 
        {
            for (int j = 1; j <= i; j++) 
            {
                System.out.print(value+ "  ");
                 
                value++;
            }
	System.out.println();
}
		System.out.println("\n\n");
		
		
		
		System.out.println("Pattern 4 HOLLOW SQUARE STAR PATTERN-------------------");
		/*
*****
*   *
*   *
*   *
*****
		 */
		
	
		for(int i = 1; i <= 5; i++)
		{
			for(int j = 1; j <= 5; j++)
			{
				if (i==1 || i==5 || j==1 || j==5)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
		}
         
        System.out.println();
        System.out.println();
        
        
        
        System.out.println("Pattern 5 DIGONAL LINE PATTREN-------------------");
        
        /*
*
  * 
    *
      *
        *
*/
		for (int i = 1; i<=10;i++)
		{
			for(int j =1; j<=i;j++)
			{
				if(i>1)
			 System.out.print(" ");
			}
			System.out.println("*");
			System.out.println();
		}
		
		
		
	}
}
		

	


