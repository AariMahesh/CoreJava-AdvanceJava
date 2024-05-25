package com.kodnest.cc;

public class A {
	int a=10;
	public A()
	{
		//super();
		System.out.println("default parent");
	}
	public A(int a)
	{
		super();
		this.a=a;
		System.out.println("parameter parent");
	}

}
