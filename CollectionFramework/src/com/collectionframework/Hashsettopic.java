package com.collectionframework;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
//import java.util.LinkedHashSet;

public class Hashsettopic {
	public static void main(String[] args)
	{
		HashSet HS=new HashSet();
		LinkedHashSet hs=new LinkedHashSet();
		HS.add(10);
		HS.add(5);
		HS.add(20);
		HS.add(25);
	    HS.add(10);
	    HS.add(null);
	    HS.add("mahesh");
		System.out.println(HS);
		hs.add(10);
		hs.add(5);
		hs.add(20);
		hs.add(25);
	    hs.add(10);
	    hs.add(null);
		System.out.println(hs);
		
	}
	

}
