package com.kodnest.strings;


public class Exam {
	public static void main(String[] args)
	{
		/*String s="(())";
		int c=0;
		int s1='(';
		int s2=')';
		String str="";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i;j<s.length();j++)
			{
				for(int k=0;k<=j;k++)
				{
					//str=str+s.charAt(k);
					System.out.println(s.charAt(k));
				}
				str="";
			}
		}*/
		int[] arr= {1,2,3,0};
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i;j<arr.length;j++)
			{
				for(int k=0;k<=j;k++)
				{
					System.out.print(arr[k]+" ");
				}
				//System.out.println();
			}
		}
	}

}
