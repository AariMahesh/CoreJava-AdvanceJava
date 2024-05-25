package com.kodnest.demofinal;
class A
{
	final void display()
	{
		System.out.println("parent");
	}
}
 class B extends A
 {
	 void display()
		{
			System.out.println("parent");
		} 
 }

public class Solution {
	public static void main(String[] args)
	{
		final double pi=3.14;
		final int a=47;
		System.out.println(a+" "+pi);
		B b=new B();
		b.display();
	}

}
