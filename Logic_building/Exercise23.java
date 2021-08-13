package Logic_building;
import java.util.Scanner;

public class Exercise23 {
	double ibm,weight,height;   
	void Calculate(double height,double weight)
	{
		ibm= (weight/(1.5*1.5));
		System.out.println("Your IBM value is "+ibm);
		if(ibm<=18.5)
			System.out.println("You are UNDERWEIGHT ");
		else if(ibm>18.5 && ibm<=25)
			System.out.println("You are NORMAL ");
		else if(ibm>25 && ibm<=30)
			System.out.println("You are OVERWEIGHT ");
		else
			System.out.println("You are OBESE ");
	}

	public static void main(String[] args) {
	
		
		Scanner scanner= new Scanner(System.in);  
		System.out.println("Enter the height and weight to calculate IBM values ");  
		System.out.print("Enter the height");  
		double height=scanner.nextDouble();
		System.out.print("Enter the weight ");  
		double weight=scanner.nextDouble();
		
		Exercise23 exercise23=new Exercise23();
		exercise23.Calculate(height, weight);
		
	}

}
