package com.kodnest;

import java.util.*;
import java.util.stream.Collectors;

public class Exampleforflatmap {
	public static void main(String[] args) {
		List<Integer> al=Arrays.asList(1,2);
		List<Integer> a1=Arrays.asList(1,2);
		List<Integer> a2=Arrays.asList(1,2);
		List<Integer> a3=Arrays.asList(1,2);
		List<List<Integer>> rs=Arrays.asList(al,a1,a2,a3);
        List<Integer> rl=(List<Integer>) rs.stream().flatMap(n->n.stream()).collect(Collectors.toList());
		
	}

}
