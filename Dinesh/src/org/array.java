package org;
import java.util.*;
public class array
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str=sc.next();
		String[] a=str.split(" ");
		int arr[]=new int[n];
		//int index=0;
		for(int i=0;i<n;i++)
		{
			arr[i]=Integer.parseInt(a[i]);
		}
		System.out.println(arr.toString());
	}

}