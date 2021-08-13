package com.techment.interfaces;

public interface Jdbc {
	
	public static void main(String[] args)
	{
Oracle connOracle= new Oracle();
connOracle.connection();

MySql connMySql= new MySql();
connMySql.connection();


	}

}
