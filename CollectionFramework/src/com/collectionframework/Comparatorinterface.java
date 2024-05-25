package com.collectionframework;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class Studentss{
	int rollno;
	String name;
	int yop;
	public Studentss(int rollno,String name,int yop)
	{
		this.rollno=rollno;
		this.name=name;
		this.yop=yop;
	}
	public String toString()
	{
		return getClass().getName()+rollno+""+yop;
	}
	
}
class YearOfPasing implements Comparator<Studentss>{

	@Override
public int compare(Studentss o1, Studentss o2) {
//		// TODO Auto-generated method stub
//		if(o1.yop>o2.yop)
//		{
//			return 1;
//		}
//		if(o1.yop<o2.yop)
//		{
//			return -1;
//		}
//		return 0;
//	}
	return Integer.compare(o2.yop,o1.yop);
	}
	
}
public class Comparatorinterface {
	public static void main(String[] args) {
		Studentss std1=new Studentss(1,"jhno",23);
		Studentss std2=new Studentss(2,"jhno",24);
		Studentss std3=new Studentss(3,"jhno",22);
		Studentss std4=new Studentss(4,"jhno",27);
		ArrayList al=new ArrayList();
		al.add(std1);
		al.add(std2);
		al.add(std3);
		al.add(std4);
		
		System.out.println(al);
		Collections.sort(al,new YearOfPasing());
		System.out.println(al);
	}
	
}

