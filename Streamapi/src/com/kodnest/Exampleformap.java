package com.kodnest;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Exampleformap {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(5);
		al.add(25);
		al.add(45);
		List<Integer> rl=al.stream().map(n->n*2).collect(Collectors.toList());
		System.out.println(rl);
		//applying both map and filter
		//List<Integer> rmf=al.stream().filter(n->n%2==0).map(n->n*2).collect(Collectors.toList());
		List<Integer> rmf=al.stream().map(n->n*2).filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(rmf);
		
	}

}
