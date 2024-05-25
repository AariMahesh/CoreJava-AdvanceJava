package com.kodnest;

import java.util.*;
import java.util.stream.Collectors;

public class Exampleforfilter {
	public static void main(String[] args) {
		List<Integer> al=new ArrayList<>();
		al.add(20);
		al.add(10);
		al.add(5);
		al.add(25);
		al.add(45);
		List<Integer> rl=al.stream().filter(n->n%2==0).collect(Collectors.toList());
		System.out.println(rl);
	}

}
