package com.collectionframework;


import java.util.Iterator;
import java.util.TreeSet;

public class Treeseet {
	public static void main(String[] args) {
		TreeSet ts=new TreeSet();
		ts.add(37);
		ts.add(27);
		ts.add(44);
		ts.add(98);
		ts.add(57);
		
		System.out.println(ts.ceiling(12));
		System.out.println(ts.first());
		
		System.out.println(ts.floor(40));
		System.out.println(ts.last());
		
		System.out.println(ts);
		for(Object b:ts)
		{
			System.out.println(b);
		}
//		int i=0;
//		while(!ts.isEmpty()) {
//			System.out.println(ts.first());
//			ts.pollFirst();
//		}
//		System.out.println("--------");
		Iterator iterator=ts.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
		
		
	}

}
