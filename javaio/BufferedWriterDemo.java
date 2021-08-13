package com.techment.javaio;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo {

	public static void main(String[] args) throws IOException {
		
		BufferedWriter bw = new BufferedWriter(new FileWriter("abc.txt"));
		// it is the combination of to lines 
//		FileWriter fw=new FileWriter("cricket.txt");
//		BufferedWriter bw=new BufferedWriter(fw);

		
		bw.write(100);    // write character in the abc file
		bw.newLine();       // provide new line
		
		
		char[] ch={'a','b','c','d'};      // initializing array to write charecter
		bw.write(ch);     // printing that array ch
		
		
		bw.newLine();
		bw.write("Techment");         // directly writing the message
		
		bw.newLine();
		bw.write("Annapurna");
		bw.write(" Shrivas");
		
		
		bw.flush();       // Clear the stream of any element that may be or maynot be inside the stream
		
		
		bw.close();

		
		
		
	}

}
