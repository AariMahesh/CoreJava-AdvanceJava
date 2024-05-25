package com.collectionframework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

//import javax.swing.text.html.HTMLDocument.Iterator;

public class AarrayListExp {
	public static void main(String[] args) {
		CopyOnWriteArrayList al=new CopyOnWriteArrayList();
		al.add(10);
		al.add(2);
		al.add(7);
		al.add(25);
		al.add(13);
		Iterator iterator=al.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
			al.add(100);
		}
		
//		for(Object o:al)
//		{
//			System.out.println(o+" ");
//			al.add(100);
//		}
		System.out.println(al);
	}

}
