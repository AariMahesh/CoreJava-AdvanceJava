package com.collectionframework;

import java.util.LinkedList;
import java.util.Queue;

public class Linkedlist {
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		System.out.println(ll);
		//ll.addFirst(30);
		//ll.addLast(20);
		//System.out.println(ll);
		//ll.add(2, 10);
		//System.out.println(ll);
		//ll.remove();
		//ll.getFirst();
		//ll.removeLast();
		System.out.println(ll.peek());
		System.out.println(ll.peekFirst());
		System.out.println(ll.peekLast());
		System.out.println(ll);
		System.out.println(ll.poll());
		System.out.println(ll);
       System.out.println(ll.pollLast());
       System.out.println(ll);
		System.out.println(ll.pollFirst());
		System.out.println(ll);
		ll.get(1);
		
	}

}
