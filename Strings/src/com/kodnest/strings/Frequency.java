package com.kodnest.strings;

public class Frequency {
	public static void main(String[] args)
	{
		String s="hello";
		String s1="";
		for(int i=0;i<s.length();i++)
		{
			if(s1.contains(s.charAt(i)+""))
			{
				continue;
			}
			else
			{
				s1=s1+s.charAt(i);
			}
		}
		System.out.println(s1);
		
		for(int i=0;i<s1.length();i++)
		{
			int c=0;
			for(int j=0;j<s.length();j++)
			{
				if(s1.charAt(i)==s.charAt(j))
				{
					c++;
				}
			}
			System.out.println(s1.charAt(i)+"frequency"+c);
		}
		//or
		int[] arr=new int[256];
		for(int i=0;i<s.length();i++)
		{
			int a=s.charAt(i);
			arr[a]++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>0)
			{
				System.out.println((char)i+" frequency is "+arr[i]);
			}
		}
		// find the frequency of each characters in an array or string
		// check the given string is panagram or not
		// display the characters with highest frequency
		// dispaly the characters with a frequenct 4 or 5(specific value)
		// display the characters with frequency >3,<4 etc
		
	}

}
