package com.techment.Exception;


class AgeException extends RuntimeException    // Unchecked Exception
{
	String msg;

	public AgeException(String msg) {
		super();
		this.msg = msg;
		System.out.println(msg);
	}
	
	
	}

class IdNotFoundException extends Exception      //Checked Exception
{
  String msg;

public IdNotFoundException(String msg) {
	super();
	this.msg = msg;
	System.out.println(msg);
}
  
}

public class CustomeException {

	public static void main(String[] args) {
		

		throw new AgeException("not a valid age");
		// throw new IdNotFoundException("not a valid age");   // generate checked exception
	}

}
