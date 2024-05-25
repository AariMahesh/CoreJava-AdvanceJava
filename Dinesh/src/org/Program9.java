package org;
import java.util.*;
public class Program9 {
	public static void main(String[] args)
	{
		System.out.print("enter a string :");
		Scanner s=new Scanner(System.in);
		String str=s.next();
		reverse(str);
		
	}
	static void reverse(String str)
	{
		char[] ch=str.toCharArray();
		int left=0;
		int right=str.length()-1;
		while(left<right)
		{
		  char temp=ch[left];
		 ch[left]=ch[right];
		 ch[right]=temp;
		 left++;
		 right--;
		 
		}
		System.out.println(new String(ch));
	}
	

}
