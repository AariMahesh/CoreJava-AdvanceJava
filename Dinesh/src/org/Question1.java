package org;
import java.util.*;
public class Question1 {
	public static void main(String[] args)
	{
		System.out.print("enter a number :");
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		prime(n);
	}
	static void prime(int n)
	{
		//int n=9;
		if(n%2==0)
		{
			System.out.println("Even");
		}
		else
		{
			System.out.println("Odd");
		}
	}

}
