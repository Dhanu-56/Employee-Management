package com.tnsif.employeemanagement;

	import java.sql.*;
	public class Dbconnection 
	{
	   public static Connection getConnection() throws SQLException
	   {
	  String url = "jdbc:mysql://localhost:3306/employeetable";
	     String userName = "root";
	     String pwd = "dhanu*2004";
	     Connection con = DriverManager.getConnection(url, userName, pwd);
	     return con;
	   }
	}

