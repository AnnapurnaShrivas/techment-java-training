package com.techment.javaio;


// Created file in default path 
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileCreateDemo {

	public static void main(String[] args) throws IOException
	{
		
		File file = new File("abc.txt");    // to  create... it will create in default path
		// for my system .. it is ...C:\Users\DELL\eclipse-workspace\Assignment
	    System.out.println(file.exists());
	    file.createNewFile();
	    System.out.println(file.exists());
	    
	    
	    File file2 = new File("C:\\Users\\DELL\\eclipse-workspace\\Assignment\\src\\com\\techment\\javaio\\xyz.txt");
	    System.out.println(file2.exists());
	    //file.createNewFile();      // creating a file
	    file2.mkdir();    // creating a folder
	    System.out.println(file2.exists());
	    
	    
	    
	    
	    
	    
		

	}

}
