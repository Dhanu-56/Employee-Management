package com.tnsif.empminiproject;
import java.sql.*;
public class Dbconnection {
	public static Connection conn() throws Exception 

	{

		//Establish Connection

		String url="jdbc:mysql://localhost:3306/employeetable";

		String username="root";

		String password="dhanu*2004";
		Connection cc=DriverManager.getConnection(url,username,password);
		return cc;

	}

	}



