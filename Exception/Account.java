package com.techment.Exception;

public class Account {
	
	int balance=5000;
	
	String withdraw(int amount)
	{
		if(amount>balance)
			throw new InsufficientFunfException("Insufficeint Fund");
		else
			return "you have withdwar " +amount+ " amount";
	}

}
