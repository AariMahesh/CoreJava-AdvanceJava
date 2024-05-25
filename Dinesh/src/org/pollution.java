package org;
import java.util.*;

public class pollution
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		int d=sc.nextInt();
		int x=sc.nextInt();
		int cEven=0,cOdd=0;
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				cEven++;
			}
			else
			{
				cOdd++;
			}
		}
		if(d%2!=0)
		{
			if(cEven==0)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println(cEven*x);
			}
		}
		else
		{
			if(cOdd==0)
			{
				System.out.println("0");
			}
			else
			{
				System.out.println(cOdd*x);
			}
		}
		
	}
}
