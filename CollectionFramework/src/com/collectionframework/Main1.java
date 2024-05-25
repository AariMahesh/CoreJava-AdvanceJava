package com.collectionframework;
import java.util.ArrayDeque;
import java.util.Iterator;
public class Main1 {
	public static void main(String[] args) {
		ArrayDeque ad=new ArrayDeque();
		ad.add(10);
		System.out.println(ad);
		ad.addFirst("mahesh");
		ad.addLast("1");
		ad.add(20);
		System.out.println(ad);
		ad.remove();
		System.out.println(ad);
		ad.removeFirst();
		System.out.println(ad);
		ad.remove(20);
		System.out.println(ad);
		ad.add(1);
		System.out.println(ad);
		ad.removeFirstOccurrence(1);
		System.out.println(ad);
		ad.offer(20);
		System.out.println(ad);
		ad.offerFirst(10);
		System.out.println(ad);
		ad.offerLast(13);
		ad.offer("mahesh");
		System.out.println(ad);
		Iterator iterator=ad.iterator();
		while(iterator.hasNext())
		{
			System.out.println(iterator.next());
		}
		
	}

}
