package Logic_building;
import java.util.Scanner;

public class Exercise48 {


		  public static void main(String[] args) {
			Scanner scan = new Scanner(System.in);
		    // binary number
			System.out.println("enter binary number");
		    long num = scan.nextLong();

		    // call method by passing the binary number
		    int decimal = convertBinaryToDecimal(num);

		    System.out.println("Binary to Decimal");
		    System.out.println(num + " = " + decimal);
		  }

		  public static int convertBinaryToDecimal(long num) {
		    int decimalNumber = 0, i = 0;
		    long remainder;
		    
		    while (num != 0) {
		      remainder = num % 10;
		      num /= 10;
		      decimalNumber += remainder * Math.pow(2, i);
		      ++i;
		    }
		    
		    return decimalNumber;
		  }
		}