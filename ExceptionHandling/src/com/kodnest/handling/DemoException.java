package com.kodnest.handling;
import java.util.*;
public class DemoException {
	public static void main(String[] args)  {
		Scanner scan=new Scanner(System.in);
		System.out.println("enter size of an array:");
		int size=scan.nextInt();
	   int[] arr=new int[size];
	   System.out.println("enter index value to get element:");
	   int index=scan.nextInt();
	   System.out.println(arr[index]);
	}

}
