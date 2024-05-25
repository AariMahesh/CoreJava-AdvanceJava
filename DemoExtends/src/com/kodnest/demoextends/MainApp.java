package com.kodnest.demoextends;

public class MainApp {
	public static void main(String[] args)
	{
		B b=new B();
		b.display();
		System.out.println(b.heig);
		System.out.println(b.age);
		b.displayA();
		A a=new A();
		a.displayA();
		System.out.println(a.age);
		//System.out.println(a.heig);
		
	}

}
