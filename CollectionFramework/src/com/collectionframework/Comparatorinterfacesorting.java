package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Students implements Comparable<Students>{
	int rollno;
	String name;
	int yop;
	public Students(int rollno,String name,int yop)
	{
		this.rollno=rollno;
		this.name=name;
		this.yop=yop;
	}
	public String toString()
	{
		return getClass().getName()+rollno+""+yop;
	}
	
	@Override
	public int compareTo(Students o) {
		// TODO Auto-generated method stub
		return this.yop-o.yop;
	}
}
public class Comparatorinterfacesorting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students std1=new Students(1,"jhno",23);
		Students std2=new Students(2,"jhno",24);
		Students std3=new Students(3,"jhno",22);
		Students std4=new Students(4,"jhno",27);
		ArrayList al=new ArrayList();
		al.add(std1);
		al.add(std2);
		al.add(std3);
		al.add(std4);
		
		System.out.println(al);
		Collections.sort(al);
		System.out.println(al);

	}

}
