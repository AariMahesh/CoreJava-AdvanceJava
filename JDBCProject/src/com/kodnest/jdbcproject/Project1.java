package com.kodnest.jdbcproject;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Collection;
import java.sql.Statement;

//JDBC_DB
public class Project1 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		System.out.println("JDBC project");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String password="Mahesh@89";
		Connection conn=DriverManager.getConnection(url, uname, password);
		Statement st=conn.createStatement();
		String sql="Create table Student(id int,name varchar(10))";
		st.execute(sql);
		conn.close();
		System.out.println("sucess");
		
	}

}
