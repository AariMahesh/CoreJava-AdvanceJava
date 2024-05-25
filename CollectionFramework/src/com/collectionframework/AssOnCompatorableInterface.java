package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

//class Product implements Comparable<Product>
//{
//	String pname;
//	int pid;
//	int pprice;
//	public Product(String pname,int pid,int pprice)
//	{
//		this.pid=pid;
//		this.pname=pname;
//		this.pprice=pprice;
//	}
//	public String toString()
//	{
//		return getClass().getName()+pid+pname+pprice;
//	}
//	@Override
//	public int compareTo(Product o) {
//		// TODO Auto-generated method stub
//		return this.pprice-o.pprice;
//	}
//}
class Product 
{
	String pname;
	int pid;
	int pprice;
	public Product(String pname,int pid,int pprice)
	{
		this.pid=pid;
		this.pname=pname;
		this.pprice=pprice;
	}
	public String toString()
	{
		return getClass().getName()+pid+pname+pprice;
	}
	
}
class PP implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		// TODO Auto-generated method stub
		return Integer.compare(o2.pprice,o1.pprice);
	}
	
}
public class AssOnCompatorableInterface {
	public static void main(String[] args) {
		Product p1=new Product("Soap",1,25);
		Product p2=new Product("Shampo",2,15);
		Product p3=new Product("vim",3,35);
		ArrayList p=new ArrayList();
		p.add(p1);
		p.add(p3);
		p.add(p2);
		System.out.println(p);
		Collections.sort(p,new PP());
		System.out.println(p);
	}

}
