package com.collectionframework;


import java.util.Collection;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Set;
import java.util.TreeMap;

class Student5
{
	int age;
	String name;
	public Student5(int age,String name)
	{
		this.age=age;
		this.name=name;
	}
}

public class Hasshmapexample {
	public static void main(String[] args) {
		//HashMap hm=new HashMap();
		//LinkedHashMap lhm=new LinkedHashMap();
		//hm.put(1,10);
		Student5 s1=new Student5(10,"mahesh");
		//hm.put(2,s1);
		//System.out.println(hm);
		//lhm.put(1, s1);
		TreeMap tm=new TreeMap();
		tm.put(10, s1);
		tm.put(2, s1);
		Set keyset=tm.keySet();
		Collection values=tm.values()
;		System.out.println(keyset);
System.out.println(values);
		System.out.println(tm);
		
		
	}

}
