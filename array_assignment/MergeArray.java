package com.techment.array_assignment;

import java.util.Arrays;  

public class MergeArray {
	public static void main(String[] args) {
		int[] firstArray = { 23, 45, 12, 78, 4, 90, 1 }; 
		int[] secondArray = { 77, 11, 45, 88, 32, 56, 3 }; 
		int farr = firstArray.length; 
		int sarr = secondArray.length; 
		int[] result = new int[farr + sarr];
		
		
		System.arraycopy(firstArray, 0, result, 0, farr);
		System.arraycopy(secondArray, 0, result, farr, sarr);
		
		System.out.println(Arrays.toString(result));
	}
} 