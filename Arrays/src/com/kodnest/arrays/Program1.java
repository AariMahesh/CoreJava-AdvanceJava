package com.kodnest.arrays;
import java.util.*;

public class Program1 {
	public static void main(String[] args)
	{
		/*int[] a=new int[5];
		a[0]=500;
		a[1]=2;
		a[2]=3;
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		byte[] b=new byte[10];
		b[0]=12;
		System.out.println(b[0]);
		System.out.println(b[1]);
		char[] c=new char[4];
		System.out.println(c[0]);
		String [] d=new String[5];
		System.out.println(d[0]);*/
	
		/*for(int i=1;i<=5;i++)
		{
			for(int j=1;j<11;j++)
			{
				
				if(i==1&&j>=6 || i==5&&j<=6 || i+j==11 || i+j==11-5)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		for(int i=2;i<=5;i++)
		{
			for(int j=1;j<6;j++)
			{
				
				if(i==1|| i==j || i==5&&j>=6)
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
			for(int k=1;k<=i;k++)
			{
				if(i==k || i==5)
			
					{
						System.out.print("*");
					}
				else
				{
					System.out.print(" ");
				}
			}
			
			
			System.out.println();
		}*/
		Scanner s=new Scanner(System.in);
		int[] arr=new int[5];
		for(int i=0;i<5;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print(arr);
		
		
	}

}
