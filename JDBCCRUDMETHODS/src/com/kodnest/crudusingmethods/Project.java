package com.kodnest.crudusingmethods;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
//import java.util.Collection;
import java.util.Scanner;

//import java.sql.Connection;
public class Project {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		Scanner sc=new Scanner(System.in);

		boolean exe=true;
		while(exe)
		{
			String operation=sc.next();
			operation=operation.toLowerCase();
			switch(operation)
			{
			case "create":
			{
				createTable();
				break;
			}
			case "insert":
			{
				InsertData();
				break;
			}
			case "update":
			{
				updateData();
				break;
			}
			case "delete":
			{
				deleteData();
				break;
			}
			case "show":
				showData();
				break;
			case "exit":
			{
				exe=false;
				break;
			}
			}
			
		}
		
	}

	public static void showData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String password="Mahesh@89";
		//Connection conn=DriverManager.getConnection(url, uname, password);
		Connection conn=DriverManager.getConnection(url, uname, password);
	}

	public static void deleteData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String password="Mahesh@89";
		//Connection conn=DriverManager.getConnection(url, uname, password);
		Connection conn=DriverManager.getConnection(url, uname, password);
		String sql="delete from product where id=?";
		Scanner s=new Scanner(System.in);
		int p_id=s.nextInt();
		//String p_details=s.next();
		//boolean p_status=s.nextBoolean();
		PreparedStatement ps=conn.prepareStatement(sql);
		//ps.setString(1,p_details);
		ps.setInt(2, p_id);
		
		//ps.setBoolean(3, p_status);
		ps.executeUpdate();
		System.out.println("delection of record is sucess");
		
	}

	public static void updateData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String password="Mahesh@89";
		//Connection conn=DriverManager.getConnection(url, uname, password);
		Connection conn=DriverManager.getConnection(url, uname, password);
		String sql="update Product set p_status=? where id=?";
		Scanner s=new Scanner(System.in);
		int p_id=s.nextInt();
		//String p_details=s.next();
		boolean p_status=s.nextBoolean();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setBoolean(1, p_status);
		ps.setInt(2, p_id);
		//ps.setString(2,p_details);
		
		ps.executeUpdate();
		System.out.println("Updation of record is sucess");
		
	}

	public static void InsertData() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		System.out.println("insertion mode");
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String password="Mahesh@89";
		//Connection conn=DriverManager.getConnection(url, uname, password);
		Connection conn=DriverManager.getConnection(url, uname, password);
		String sql="Insert into Product values(?,?,?)";
		Scanner s=new Scanner(System.in);
		int p_id=s.nextInt();
		String p_details=s.next();
		boolean p_status=s.nextBoolean();
		PreparedStatement ps=conn.prepareStatement(sql);
		ps.setInt(1, p_id);
		ps.setString(2,p_details);
		ps.setBoolean(3, p_status);
		ps.executeUpdate();
		System.out.println("Insertion of record is sucess");
		
	}

	public static void createTable() throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/JDBC_DB";
		String uname="root";
		String password="Mahesh@89";
		//Connection conn=DriverManager.getConnection(url, uname, password);
		Connection conn=DriverManager.getConnection(url, uname, password);
		String sql="create table Product(p_id int,p_details varchar(20),p_status boolean)";
		Statement statement=conn.createStatement();
		statement.execute(sql);
		System.out.println("creation of table is sucess");
		
	}

}
