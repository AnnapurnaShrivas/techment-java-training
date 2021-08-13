package com.techment.collectionassinment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import com.techment.collectionassinment.Patient;



class ageSort implements Comparator<Patient>
{
	

	@Override
	public int compare(Patient o1, Patient o2) {
	    if( o1.getAge() > o2.getAge())
	    {
	    	return 1;
	    }
	    else if(o1.getAge() == o2.getAge())
	    	return -1;
	    else
	    return 0;
	}
	
}

public class TestPatientList {

	public static void main(String[] args) {
		
		

	
		ArrayList<Patient> patients = new ArrayList<Patient>();
		patients.add(new Patient(1, "sachin", 34));
		patients.add(new Patient(2, "abhishek", 23));
		patients.add(new Patient(3, "mukesh", 45));
		patients.add(new Patient(4, "suresh", 15));
		
		System.out.println("================Name in natural order===============");

		for (Patient p :patients)
		{
			System.out.println(p);
		}

		
		
		System.out.println("\n============sort age using iterator=============");
		
		
		Collections.sort(patients);
		
		Iterator<Patient> it = patients.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
		
		
	}
	/*public static void problem7()
	{
		///////////////////////////8/Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the first number");
		int number1 = scanner.nextInt();
		System.out.println("Enter the second number");
		int number2 = scanner.nextInt();
		if(number1>0 && number2>number1)
		{
			for(int i = number1;i<=number2;i++)
			{
				System.out.println("Number " + i + "  Solder Can Go");
			}
		}
		else
			System.out.println("Please Enter the valid numbers");
		scanner.close();
	}*/

}
