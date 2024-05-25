package com.kodnest.handling;

//import java.util.*;

public class Solution {
	public static void main(String[] args) {
		System.out.println("main() start");
		method1();
		System.out.println("main() stop");
	}
	private static void method1()
	{
		System.out.println("method 1 start");
		method2();
		System.out.println("method 1 stop");
	}
	private static void method2()
	{
		System.out.println("method 2 start");
		method3();
		System.out.println("method 2 stop");
	}
	private static void method3()
	{
		System.out.println("method 3 start");
		method4();
		System.out.println("method 3 stop");
	}
	private static void method4()
	{
		System.out.println("method 4 start");
		method5();
		System.out.println("method 4 stop");
	}
	private static void method5()
	{
		System.out.println("method 5 start");
		System.out.println(3/0);
		System.out.println("method 5 stop");
	}

}
