package org;
import java.util.*;
public class International {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		long result=count(n);
		System.out.println(result);
	}
	public static long count(int n)
	{
		long total=1;
		for(int i=1;i<n;i++)
		{
			total*=i;
		}
		return total*2;
	}
	

}
