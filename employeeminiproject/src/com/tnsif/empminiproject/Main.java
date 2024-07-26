package com.tnsif.empminiproject;
import java.sql.*;
import java.util.*;
public class Main {
	public static void main(String[] args) throws Exception
	{
	//ConnectionEstablishment.conn();
	Scanner sc=new Scanner(System.in);
	char ch='y';
	while(ch!='n')
	{
	System.out.println("Insert");
	System.out.println("delete");
	System.out.println("Update");
	System.out.println("show");

	System.out.println("Enter your option");
	int op=sc.nextInt();

	if(op<5)
	{
	switch(op)
	{
	case 1:
	Operations.insert();
	break;
	//System.out.println("No of rows affected");
	case 2:
	Operations.delete();
	break;
	//System.out.println("No of rows deleted");
	case 3:
	Operations.update();
	break;
	//System.out.println("No of rows updated");
	case 4:
	Operations.show();
	break;
	}
	}
	System.out.println("Are you want to continue(y/n)");
	ch=sc.next().charAt(0);
}
}
}

