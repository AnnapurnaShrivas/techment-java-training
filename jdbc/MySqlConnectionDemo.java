package com.techment.jdbc;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.Connection;

public class MySqlConnectionDemo {

	public static void main(String[] args) {
		
//		A a= new A();
		
		try
		{
//			Class.forName("com.techment.jdbc.A");
			
			
//			STEP 1=====
			Class.forName("com.mysql.cj.jdbc.Driver");   // LOAD A DRIVER CLASS
			System.out.println("class found");
			
			
			
//			STEP 2========= create connection
			Connection connection =  DriverManager.getConnection("jdbc:mysql://localhost:3306/techment?autoReconnect=true&useSSL=false", "root", "Annapurna@1998");
			System.out.println("==Connected==");
			
			
//			STEP 3=========== crest statement object
			Statement statement = connection.createStatement();
//			statement.execute("insert into employee values(2,'sachin',34000); ");
//			statement.execute("insert into employee values(3,'mukesh',55000); ");
//			statement.execute("insert into employee values(4,'suresh',24000); ");
//			statement.execute("insert into employee values(5,'aadi',12000); ");
//			System.out.println("data inserted");
//			
//			
		ResultSet rs	= statement.executeQuery("select * from employee");
		
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3));
			                 // rs.getInt(col-1)+" "+rs.getString(col-2)+" "+rs.getInt(col-3)
		}
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	

	}

}
