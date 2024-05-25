package com.kodnest.overriding;
/*class Parent
{
	private void display()
	{
		System.out.println("welcome");
	}
	int display(int a)
	{
		return a;
	}
}
class Child extends Parent
{
	
	default void display()
	{
		System.out.println("override");
	}
	int display(int a)
	{
		return a+a;
	}
}*/
public class App {
	public static void main(String[] args)
	{
		//Child c=new Child();
		//c.display();
		//System.out.print(c.display(10));
		int n=10;
		System.out.println("original");
		modify(n);
		System.out.println("modified"+n);
	}
	static void modify(int n)
	{
	  n=n+n;
	}

}
