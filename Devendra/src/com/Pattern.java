package com;

public class Pattern {
	public static void main(String[] args) {
		String str="baaacaaadaaae";
		int count=0;
		while(str.length()>0)
		{
			str=str.replace(str.charAt(0), ' ');
			str=str.strip();
			count++;
		}
		System.out.println(count);
		System.out.println("-------------");
		
	
	for(int i=0;i<10;i++)
	{
		if(i<9)
		{
			System.out.print("*");	
		}
		
		for(int j=0;j<10;j++)
		{
			if(9-i==j && i<9)
			{
				System.out.print("*");
			}
			else
			{
				if(i>8)
				{
					break;
				}
				System.out.print(" ");
			}
			
		}
		if(i>8)
		{
			break;
		}
		System.out.println();
		
	}
	//System.out.println("hi");
	for(int i=2;i<=10;i++)
	{
		if(i>1)
		{
			System.out.print("*");
		}
		
		for(int j=1;j<=10;j++)
		{
			if(i==j)
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
	System.out.println("-------------------");
	
	
	}
}
