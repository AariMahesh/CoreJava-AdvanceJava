package com.kodnest.cc;

public class B {
	int b=20;
	public B()
	{
		//super();
		
         System.out.print('1');
		//System.out.println("default child");
	}
	public B(int b)
	{
		this(10,"mahesh");
		System.out.print('2');
		//super(b);
		//this.b=b;
		//System.out.println("parameter child");
	}
	public B(String a)
	{
		
		this();
		System.out.print('3');
	}
	public B(int a,String b)
	{
	    this("mahesh",10);
		System.out.print('4');
	}
	public B(String b,int a)
	{
		this("mahesh");
		System.out.print('5');
	}

}
