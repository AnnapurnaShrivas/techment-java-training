package com.techment.array_assignment;

import java.util.Arrays;
import java.util.Scanner;   

public class SortingArray {
	public static void main(String[] args) {
		int[] array = new int[10];
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter elment 1 by 1 for sorting");
		for(int i=0;i<10;i++)
		{
			array[i]=sc.nextInt();
		}

		
 
		Arrays.sort(array);
		
		
		System.out.println("Elements of array sorted in ascending order: ");

		for (int i = 0; i < array.length; i++) {
			System.out.print(array[i]+"\t");
		}
	}
}  