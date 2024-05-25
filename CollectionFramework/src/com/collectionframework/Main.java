package com.collectionframework;
import java.util.*;
class Student{
	int rollno;
	String name;
	int yop;
	public Student(int rollno,String name,int yop)
	{
		this.rollno=rollno;
		this.name=name;
		this.yop=yop;
	}
	public String toString()
	{
		return getClass().getName()+rollno+"";
	}
}
public class Main {
public static void main(String[] args) {
	ArrayList al=new ArrayList();
//	al.add(10);
//	al.add(20);
//	al.add(30);
//	System.out.println(al);
//	ArrayList al2=new ArrayList();
//	al2.add(40);
//	al2.add(50);
//	al2.add(60);
//	//al2.add(al);
//	System.out.println(al2);
//	ArrayList al3=new ArrayList();
//	//al3.addAll(al);
//	al3.add(70);
//	al3.add(80);
//	System.out.println(al3);
//	al3.addAll(al2);
//	System.out.println(al3);
//	//al3.add
//	al.add(10);
//	al.add(20);
//	al.add(40);
//	al.add(50);
//	al.add(38);
//	al.add(50);
	//al.remove(0);
	//al.remove(30);
//	ArrayList ar1=new ArrayList();
//	ar1.add(10);
//	ar1.add(20);
//	ar1.add(al);
	//al.remove(al);
	//ar1.remove(al);
	//ar1.removeAll(al);
//	System.out.println(al);
//	al.remove(1);
//	System.out.println(al);
//	//al.remove(5);
//	al.remove(2);
//	System.out.println(al);
//	al.remove(2);
//	System.out.println(al);
//	al.add(10);
//	al.add(50);
//	System.out.println(al);
//	ArrayList ar1=new ArrayList();
//	ar1.add(20);
//	ArrayList ar2=new ArrayList();
//	ar2.add(40);
//	ar1.add(ar2);
//	System.out.println(ar1);
//	al.add(1, ar1);
//	System.out.println(al);
//	ArrayList ar3=new ArrayList();
//	ar3.add(38);
//	ar3.add(50);
//	al.add(ar3);
//	System.out.println(al);
	al.add(20);
	al.add(10);
	al.add(40);
	al.add(40);
	System.out.println(al);
//	for(int i=al.size()-1;i>=0;i--)
//	{
//		System.out.println(al.get(i));
//	}
//	int i=0;
//	while(i<al.size()-1)
//	{
//		System.out.println(al.get(i));
//		i++;
//	}
//	do
//	{
//		System.out.println(al.get(i));
//		i++;
//	}while(i<al.size()-1);
	Iterator iterator=al.iterator();
	while(iterator.hasNext())
	{
		System.out.println(iterator.next());
	}
	
	TreeSet t=new TreeSet();
	t.addAll(al);
	System.out.println(t);
ArrayList ai=new ArrayList();
//	ai.add("Mahes");
//	ai.add("move");
//	ai.add("A");
//	//pass to hashtree 
//	//use sorting techniques
//	Collections.sort(ai);
//	System.out.println(ai);
	Student std=new Student(1,"jhno",23);
	ai.add(std);
	Student std1=new Student(1,"jhno",23);
	Student std2=new Student(1,"jhno",23);
	ai.add(std1);
	ai.add(std2);
	//System.out.println(ai);
	
	
	
	
}
}
