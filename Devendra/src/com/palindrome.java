package com;
import java.util.*;
public class palindrome {
	public static void main(String[] args)
	{
		Scanner dev=new Scanner(System.in);
		int num=dev.nextInt();
		int r,sum=0,temp;
		temp=num;
		while(num>0)
		{
			r=num%10;
			sum=sum*10+r;
			num=num/10;
		}
		if(temp==sum)
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not A Palindrome");
		}
	}

}
