package org;
import java.util.*;

public class intelligence
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int sum=0;
		while(n>0)
		{
			sum+=n%10;
			n=n/10;
		}
		int t=r*sum;
		int sum1=0;
		while(t>0)
		{
			sum1+=t%10;
			t=t/10;
		}
		System.out.println(sum1);
	}
}
