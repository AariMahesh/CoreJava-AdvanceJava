package com.methodproto;

public class Methodprogram1 {
	public static void main(String[] args)
	{
		System.out.println("Hello");
		int a=5,b=6,c=7,d=8;
		System.out.println(sum(a,b));
		
		System.out.println(main("mahesh"));
		main('A');
	}
	static String main(String a)
	{
		return a;
	}
	 static void main(char a)
	{
		 System.out.println(a);
	}
	
	public static int sum(int a,int b)
	{
		return a+b;
	}
	public static int sum(int a,int b,int c)
	{
		return a+b+c;
	}
	public static int sum(int a,int b,int c,int d)
	{
		return a+b+c;
	}
	

}
