package com.kodnest.demostatic;


public class App {
	public App()
	{
		System.out.print(5);
	}
	static void display1()
	{
		System.out.print("1");
	}
	{
		System.out.print("3");
	}
	public App(int a)
	{
		System.out.print("5");
	}
	{
		System.out.print("4");
	}
	static void display2()
	{
		System.out.print("2");
	}
	public static void main(String[] args)
	{
		new App();
		System.out.print("1");
		new App(45).display2();
		new App().display1();
	}

}
