package com.kodnest.jdbcproject;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
public class Question1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String pass="Mahesh@89";
		Connection con=DriverManager.getConnection(url,uname,pass);
		String sql="delete from student where id=?";
		PreparedStatement ps=con.prepareStatement(sql);
		Scanner sc=new Scanner(System.in);
		int id=sc.nextInt();
		//String name=sc.next();
		//ps.setString(1, name);
		ps.setInt(1,id);
		
		ps.execute();
		
		System.out.println("Sucess");
		
	}

}
