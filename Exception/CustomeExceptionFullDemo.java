package com.techment.Exception;

public class CustomeExceptionFullDemo {

	public static void main(String[] args) {
		
		
		Account account = new Account();
		
		try    //
		{
			System.out.println(account.withdraw(20000));
		}
		catch(InsufficientFunfException e)
		{
		System.out.println(e.getMessage());
		}
		
	}

}
