package com.kodnest.basics;

public class SumOfNumbers {
	public static void main(String[] args) {
		int n=10;
		System.out.println(sum(n));
		//time taken
		System.out.println("time taken is"+(System.currentTimeMillis())+"milliseconds");
	}

	private static int sum(int n) {
		// TODO Auto-generated method stub
		return n*(n+1)/2;
	}

}
