package com.techment.array_assignment;

import java.util.Scanner;
public class LargeSmallNo
{
	public static void main (String[] args)
	{
		Scanner scn = new Scanner (System.in);
		System.out.print("Enter no. of elements you want in array:");
                int n = scn.nextInt();
 
		int array[] = new int[n];
                System.out.println("Enter all the elements:");
		for (int i = 0; i < array.length; i++)
		{
			array[i] = scn.nextInt();
		}
 
		int largest1, largest2, templ,smallest1,smallest2,temps;
 
		largest1 = array[0];
		largest2 = array[1];
		smallest1 = array[0];
		smallest2 = array[1];
 
		
		
		// to find lastest
		if (largest1 < largest2)
		{
			templ = largest1;
			largest1 = largest2;
			largest2 = templ;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] > largest1)
			{
				largest2 = largest1;
				largest1 = array[i];
			}
			else if (array[i] > largest2 && array[i] != largest1)
			{
				largest2 = array[i];
			}
		}
		
		
		
		//to find smallest
		if (smallest1 > smallest2)
		{
			int temp2 = smallest2;
			smallest2 = smallest1;
			smallest1 = temp2;
		}
 
		for (int i = 2; i < array.length; i++)
		{
			if (array[i] < smallest1)
			{
				smallest2 = smallest1;
				smallest1 = array[i];
			}
			else if (array[i] < smallest2 && array[i] != smallest1)
			{
				smallest2 = array[i];
			}
		}
 
		System.out.println ("The First largest is " + largest1);
		System.out.println ("The Second largest is " + largest2);
		System.out.println ("The First Smallest is " + smallest1);
		System.out.println ("The Second Smallest is " + smallest2);
 
	}
}
