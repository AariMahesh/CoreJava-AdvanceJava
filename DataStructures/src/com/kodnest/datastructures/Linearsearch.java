package com.kodnest.datastructures;
import java.util.*;

public class Linearsearch {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int tar=scan.nextInt();
		int res=linearSearch(arr,tar);
		if(res==1)
		{
			System.out.println("element found at index:"+res);
		}
		else
		{
			System.out.println("element not found in array");
		}
		
		
	}
	public static int linearSearch(int[] arr,int tar)
	{
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]==tar)
			{
				return 1;
			}
		}
		return -1;
	}

}
