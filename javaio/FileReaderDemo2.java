package com.techment.javaio;

import java.io.FileReader;
import java.io.IOException;

public class FileReaderDemo2 {

	public static void main(String[] args) throws IOException{
		
		FileReader fr = new FileReader("abc.txt");
		
		int ch= fr.read();
		
		System.out.println(ch);
		
		while(ch!=-1)
		{
			System.out.println(ch);   // reading character 1 by 1 and returing ASCII value
			System.out.println((char)ch);    //ASCII into characters
			ch=fr.read();	// increment
			
		}
		

	}

}
