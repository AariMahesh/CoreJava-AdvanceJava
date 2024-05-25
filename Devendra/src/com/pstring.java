package com;
import java.util.*;
public class pstring {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		String str="malayalam";
		String rev="";
		for(int i=str.length()-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);
		}
		if(rev.equals(str))
		{
			System.out.println(rev+"=="+str);
		}
		int num=scan.nextInt();
		int c=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(c==0)
		{
			System.out.println(num+" is prime");
		}
		else
		{
			System.out.println("not a prime");
		}
		int fact=1;
		for(int i=num;i>=1;i--)
		{
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
