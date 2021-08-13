package com.techment.javaio;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo  {

	public static void main(String[] args) throws IOException{
		
		FileWriter fw = new FileWriter("abc.txt",true);
		
		
		fw.write("Hello \78");
		fw.write(92);
		fw.write("WElcome");
		System.out.println("Written Successfully");
		fw.close();
		
		

	}

}
