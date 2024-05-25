package com.collectionframework;
import java.util.Iterator;
//import java.util.PriorityQueue;
//import java.util.PriorityQueue;
//import java.util.*;
import java.util.concurrent.PriorityBlockingQueue;
public class Main2 {
	public static void main(String[] args) {
		PriorityBlockingQueue pq=new PriorityBlockingQueue();
		pq.add(22);
		pq.add(8);
		pq.add(2);
		pq.add(7);
		pq.add(3);
		pq.add(17);
		pq.add(19);
		//pq.add('a');
		//pq.add("mahesh");
		
		System.out.println(pq);
		//PriorityQueue pq1=new PriorityQueue();
		Object[] arr=pq.toArray();
		System.out.println(arr);
		for(int i=0;i<arr.length;i++)
		{
			System.out.println(arr[i]);
		}
		Iterator iterator=pq.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
	}

}
