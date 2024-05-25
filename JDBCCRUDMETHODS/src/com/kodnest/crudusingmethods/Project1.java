package com.kodnest.crudusingmethods;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
public class Project1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String pas="Mahesh@89";
		Connection con=DriverManager.getConnection(url, uname, pas);
		//Statement stm=con.createStatement();
		//String sql="create table Student(id int,name varchar(10))";
		//stm.execute(sql);
		String sql="insert into Student values(?,?)";
		PreparedStatement stm=con.prepareStatement(sql);
		Scanner s=new Scanner(System.in);
		int id=s.nextInt();
		String name=s.next();
		Student std=new Student(id,name);
//		std.setId(id);
//		std.setName(name);
		stm.setInt(1, std.getId());
		stm.setString(2, std.getName());
		
		stm.executeUpdate();
		try
		{
			con.setAutoCommit(false);
			String sql1="update Student set name='mahesh' where id=2";
			String sq2="updat Student set name='loki' where id=1";
			Statement stmp=con.createStatement();
			stmp.execute(sql1);
			stmp.execute(sq2);
			con.setAutoCommit(true);
			
		}
		catch(Exception e)
		{
			con.rollback();
			e.printStackTrace();
			
		}
		System.out.println("sucess");
	}

}
