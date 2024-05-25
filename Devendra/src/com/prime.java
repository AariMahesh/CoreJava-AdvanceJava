package com;
import java.util.*;
public class prime {
	public static void main(String[] args)
	{
		Scanner dev=new Scanner(System.in);
		int num=dev.nextInt();
		/*for(int i=1;i<=num;i++)
		{
			int c=0;
			for(int j=2;j<i;j++)
			{
				if(i%j==0)
				{
					c++;
				}
			}
			if(i==1||c==0)
			{
				System.out.print(i+" ");
			}
		}*/
		int c=0;
		for(int i=2;i<num;i++)
		{
			if(num%i==0)
			{
				c++;
			}
		}
		if(num==1||c==0)
		{
			System.out.println("Prime Number");
		}
		else
		{
			System.out.println("Not A Prime Number");
		}
	}

}
