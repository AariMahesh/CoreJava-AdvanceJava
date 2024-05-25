package com.kodnest.questionsonstrings;
import java.util.*;

public class Programs {
	public static void main(String[] args)
	{
		//String s1=createString1();
		//String s2=createString2();
		//String s3=createString3();
		//stringReverse(s2);
		//displayEvenIndexChar(s2);
		//displayOddIndexChar(s2);
		//displayString(s1);
		//displayString(s2);
		//displayString(s3);
		//String u=convertToUpperCase(s2);
		//String l=convertToLowerCase(s2);
		//displayString(l);
		String s="HELLO World welcome";
		System.out.println(s.length());
		String[] sp=s.split(" ");
		int l=0;
		for(int i=0;i<sp.length;i++)
		{
			if(l<sp[i].length())
			{
				l=sp[i].length();
			}
		}
		System.out.println(l);
        
		/*for(int i=0;i<s.length();i++)
		{
			if((int)s.charAt(i)>=65&&(int)s.charAt(i)<=90)
			{
				System.out.print((char)(96+(int)s.charAt(i)-64));	
			}
			else if((int)s.charAt(i)>=97&&(int)s.charAt(i)<=122)
			{
				System.out.print((char)(64+(int)s.charAt(i)-96));	
			}
			else
			{
				System.out.print(s.charAt(i));	
			}
			
		}
	}*/
	public static String createString1()
	{
		String s="abcd";
		return s;
	}
	public static String createString2()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the string value:");
		String str=new String();
		str=scanner.next();
		String s=new String(str);
		return s;

	}
	public static String createString3()
	{
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the size of arr:");
		int size=scanner.nextInt();
		char[] ch= new char[size];
		System.out.println("Enter the char elements:");
		for(int i=0;i<ch.length;i++)
		{
			ch[i]=scanner.next().charAt(0);
		}

		String s=new String(ch);
		return s;
	}
	public static void displayString(String s)
	{
		System.out.println(s);
	}
	public static void stringReverse(String s)
	{
		for(int i=s.length()-1;i>=0;i--)
		{
			System.out.print(s.charAt(i));
		}
		System.out.println();
	}
	public static void displayEvenIndexChar(String s)
	{
		System.out.print("Elements of string at even index: ");
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2==0)
			{
				System.out.print(s.charAt(i)+" ");
			}

		}
		System.out.println();
	}
	public static void displayOddIndexChar(String s)
	{
		System.out.print("Elements of string at odd index: ");
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2!=0)
			{
				System.out.print(s.charAt(i)+" ");
			}

		}
		System.out.println();
	}
	public static String convertToUpperCase(String s)
	{
		String str=s.toUpperCase();
		return str;
	}
	public static String convertToLowerCase(String s)
	{
		String str=s.toLowerCase();
		return str;
	}


}
