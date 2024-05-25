package com.kodnest.transactions;

import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;
import java.sql.Connection;
public class DemoTransactions {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		Class.forName("com.mysql.cj.jdbc.Driver");
		String url="jdbc:mysql://localhost/Bank";
		String uname="root";
		String password="Mahesh@89";
		Connection connection=DriverManager.getConnection(url,uname,password);
		
		//String sql="create table Account(id int,amount int)";
//		Scanner sc=new Scanner(System.in);
//		System.out.print("Number of Records to be inserted: ");
//		int n=sc.nextInt();
//		System.out.println();
//		for(int i=1;i<=n;i++)
//		{
//			String sql="insert into Account values(?,?)";
//			PreparedStatement stm=connection.prepareStatement(sql);
//			System.out.println(" Enter Record "+i+" to be inserted :");
//			int id=sc.nextInt();
//			int amount=sc.nextInt();
//			stm.setInt(1, id);
//			stm.setInt(2,amount);
//			stm.execute();
//			System.out.println("Insertion of record "+i+" is sucess");
//			
//		}
		//stm.executeUpdate();
		//1String sql="insert into Account values(?,?)";
		String sql1="update Account set amount=2000 where id=4";
		//String sql2="insert into Account values(6,6000)";
		String sql3="delet from Account where id=4";
		//String sql4="update Account set amount=amount-1000 where id=4";
		//String sql5="update Account set amount=amount-1000 where id=5";
		Statement stm=connection.createStatement();
		try
		{
		connection.setAutoCommit(false);	
		
		stm.addBatch(sql1);
		//stm.addBatch(sql2);
		stm.addBatch(sql3);
		//stm.addBatch(sql4);
		//stm.addBatch(sql5);
		stm.executeBatch();
		connection.setAutoCommit(true);
		}
		catch(Exception e)
		{
			connection.rollback();
		}
		System.out.println("sucess");
	}

}
