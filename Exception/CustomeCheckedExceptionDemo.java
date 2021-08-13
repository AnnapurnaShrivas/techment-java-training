package com.techment.Exception;


class LateException extends Exception
{
	public LateException(String msg)
	{
		super(msg);
	}
}

class Student
{
	void login(int time)  throws LateException
	{
		if(time>9)
			throw new LateException("You are absent");
		else
			System.out.println("you are present");
	}
}

public class CustomeCheckedExceptionDemo {

	public static void main(String[] args) {
		

		Student student =new Student();
		
		try
		{
		student.login(8);
		}
		catch(LateException e)
		{
			System.out.println(e.getMessage());
		}
	}

}
