package com.collectionframework;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Comparisiontable {
	public static void main(String[] args) {
//		ArrayList ar=new ArrayList();
//		ar.add(25);
//		ar.add(5);
//		ar.add("mahesh");
//		ar.add(5);
//		ar.add(null);
		//LinkedList ar=new LinkedList();
		//ArrayDeque ar=new ArrayDeque();
		PriorityQueue ar=new PriorityQueue();
		ar.add(25);
	    ar.add(5);
	    //ar.add("mahesh");
	    ar.add(5);
	    //ar.add(null);
		System.out.println(ar);
//		for(int i=0;i<ar.size();i++)
//		{
//			System.out.println(ar.);
//		}
		for(Object o:ar)
		{
			System.out.println(o);
		}
		Iterator iterator=ar.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
