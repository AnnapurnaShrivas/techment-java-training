package com.techment.Exception;

import java.io.FileNotFoundException;
import java.io.IOException;

public class CheckedAndUnchecked {

	public static void main(String[] args) throws FileNotFoundException{
		
		//throw new ArithmeticException("Some this is wrong");
		// its runtime Error
		
		
		 throw new FileNotFoundException("File is not present");
        // this line is show error because it is compile time error 
		 // but by adding throws Exception in main function.. we can solve this problem 
		 // or we can use try and catch block also .. but it is not good way to do this
	}

}
