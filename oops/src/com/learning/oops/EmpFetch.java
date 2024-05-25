package com.learning.oops;
import java.util.*;
public class EmpFetch {
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		
		
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=i;j++)
			{
				  System.out.print("*");
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=3;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=i;j++)
			{
				System.out.print("#");
			}
			
			System.out.println();
		}
		for(int i=1;i<=4;i++)
		{
			for(int j=4;j>=i;j++)
			{
				  System.out.print("*");
			}
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=2;j>=i;j--)
			{
				System.out.print(" ");
			}
			for(int j=4;j>=i;j--)
			{
				System.out.print("#");
			}
			
			System.out.println();
		}
		
}
}
