package com.kodnest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class Exampleforreduce {
	public static void main(String[] args) {
		// distinct(),count(),limit(),min(),max()
		List<Integer> li=Arrays.asList(1,1,2,6,2,9);
		List<Integer> r=li.stream().distinct().collect(Collectors.toList());
		System.out.println(r);
		System.out.println(li.stream().distinct().count());
		System.out.println(li.stream().distinct().limit(2).collect(Collectors.toList()));
		Optional<Integer> min=li.stream().min((n,m)->{ return n.compareTo(m);});
		System.out.println(min.get());
		// max same as min
		//reduce()
		//distinct
		//max
		//min
		//limilt
		//paralleStream() ,parallel(),Collectors.reverseOrder
		//sorted
		
	}

}
