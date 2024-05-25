package com.kodnest.strings;

public class Recursion {
	public static void main(String[] args)
	{
		System.out.print(0+" "+1+" ");
           display(0,1,1);
	}
	private static void display(int a,int i,int j)
	{
		//System.out.println("recursion");
		/*if(a>0)
		{
			return a*display(a-1);
		}
		else
		{
			return 1;
		}
		*/
		/*if(i>10)
		{
			return;
		}
		else
		{
			System.out.println(a+"*"+i+"="+a*i);
			display(a,i+1);
		}
		*/
		int c=a+i;
		a=i;
		i=c;
		if(j<=10)
		{
			System.out.print(c+" ");
			j++;
			display(a,i,j);
		}
		
		
		
	}

}
