package com.techment.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.io.IOException;

public class ConnectionDetail {

	public static Connection getConnected() throws Exception
	{
		Class.forName(ConnectionProperty .DRIVER_NAME);
		Connection con=DriverManager.getConnection(ConnectionProperty.URL,ConnectionProperty.USERNAME,ConnectionProperty.PASSWORD);
		System.out.println("Successfully connected");
		return con;
		
	}
}

