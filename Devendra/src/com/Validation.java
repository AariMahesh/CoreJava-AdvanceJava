package com;

public class Validation {
	public static void main(String[] args)
	{
		int marks=0;
		if(marks>=81&&marks<=100)
		{
			System.out.println("Distinction");
		}
		else if(marks>=35&&marks<=80)
		{
			System.out.println("First Class");
		}
		else if(marks>=0&&marks<=35)
		{
			System.out.println("Fail");
		}
		else
		{
			System.out.println("Invalid marks");
		}
		factory();
	}

	private static void factory() {
		String str1="10110";
		//String[]
		int c=0;
		//str1.repl
		for(int i=1;i<str1.length()-1;i++)
		{
			if(str1.charAt(i-1)=='0'&&(str1.charAt(i)=='1'||str1.charAt(i)=='0'))
					{
				continue;
					}
			else if(str1.charAt(i-1)=='1'&&str1.charAt(i)=='0')
			{
				str1=str1.replace('0','1');
				c++;
			}
		}
		System.out.println(str1);
		System.out.println(c);
		// TODO Auto-generated method stub
		
	}

}
