package com.tnsif.empminiproject;
import java.sql.*;
import java.util.*;
public class Operations {
	static Scanner sc=new Scanner(System.in);
	public  static void insert() throws Exception
	{
	System.out.println("INSERTING");
	System.out.println("Enter employee id:");
	int emp_id=sc.nextInt();
	System.out.println("Enter employee name:");
	String emp_name=sc.next();
	System.out.println("Enter employee location:");
	String emp_loc=sc.next();
	System.out.println("Enter employee designation:");
	String emp_desig=sc.next();
	System.out.println("Enter employee salary:");
	double sal=sc.nextDouble();
	Connection cc= Dbconnection.conn();
	Statement st=cc.createStatement();
	String q="insert into employee values(?,?,?,?,?);";
	PreparedStatement ps=cc.prepareStatement(q);
	ps.setInt(1, emp_id);
	ps.setString(2,emp_name);
	ps.setString(3,emp_loc);
	ps.setString(4,emp_desig);
	ps.setDouble(5,sal);
	int r=ps.executeUpdate();
	if(r==1)
	System.out.println("rows affected");
	else
	System.out.println("Not affected");
	}
	public static void delete() throws Exception
	{
	System.out.println("Enter employee id");
	int del=sc.nextInt();
	Connection cc=Dbconnection.conn();
	String q="delete from employee where id=?;";
	PreparedStatement ps=cc.prepareStatement(q);
	ps.setInt(1,del);
	int r=ps.executeUpdate();
	if(r==1)
	System.out.println("row was deleted");
	else
	System.out.println("Not deleted");


	}
	public static void  update() throws Exception
	{
	PreparedStatement ps=null;
	Connection cc=Dbconnection.conn();
	cc=null;
	
	System.out.println("Enter id to update the details:");
	int id=sc.nextInt();
	System.out.println("Enter the details you want to update:\n1.emp_name \n2.emp_desig \n3.sal");
	int fill=sc.nextInt();
	switch(fill)
	{
	case 1:
	 System.out.println("Updated name:");
	 String emp_name1=sc.nextLine();
	 ps=cc.prepareStatement("update employee SET name='?' where id='?';");
	              ps.setString(1,emp_name1);
	              ps.setInt(2,id);
	              break;
	   case 2:
	 System.out.println("Updated designation");
	 String emp_desig1=sc.nextLine();
	 ps=cc.prepareStatement("update employee SET designation=? where id=?;");
	              ps.setString(1,emp_desig1);
	              ps.setInt(2,id);
	 break;
	 
	   case 3:
	 System.out.println("Updated salary:");
	 Double sal1=sc.nextDouble();
	 ps=cc.prepareStatement("update employee 1SET salary=? where id=?;");
	              ps.setDouble(1,sal1);
	              ps.setInt(2,id);
	 break;
	 

	}
	int r=ps.executeUpdate();
	if(r==1)
	System.out.println("row was updated");
	else
	System.out.println("row was not updated");

	}

	public  static void show() throws Exception
	{
	Connection cc=Dbconnection.conn();
	String q="select * from employee;";
	Statement st=cc.createStatement();
	ResultSet rs=st.executeQuery(q);
	while(rs.next())
	{
	System.out.println("Emp_Id"+rs.getInt(1));
	System.out.println("Emp_name"+rs.getString(2));
	System.out.println("Emp_location"+rs.getString(3));
	System.out.println("Emp_designation"+rs.getString(4));
	System.out.println("salary"+rs.getDouble(5));
	System.out.println();
	}


  }
}

