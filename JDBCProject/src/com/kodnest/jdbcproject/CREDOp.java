package com.kodnest.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class CREDOp {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String un="root";
		String pas="Mahesh@89";
		Connection con=DriverManager.getConnection(url,un,pas);
		//Statement stm=con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);
		//read-->   int fff=stm.executeUpdate("insert into Mahi values(2)");
		//update--> int ur=stm.executeUpadte("update table Mahi set id=3 where id=2");
		//delete--> int del=stm.executeUpdate("delete from Mahi where id=1");
		//System.out.println(del);
		// projection
		// displaying records in forward and reverse
//		String sql="Select * from student";
//		ResultSet res=stm.executeQuery(sql);
//		while(res.next())
//		{
//			System.out.println(res.getInt(1)+" "+res.getString(2));
//		}
//		res.last();
//		while(res.previous())
//		{
//			System.out.println(res.getInt(1)+" "+res.getString(2));
//		}
		// insert records dynamically
		//Statement stm=con.createStatement();
		String sql="insert into student values(?,?)";
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		String name=sc.next();
		PreparedStatement stm=con.prepareStatement(sql);
		stm.setInt(1,id);
		stm.setString(2, name);
		stm.execute();
		System.out.println("sucess");
		con.close();
	}

}
