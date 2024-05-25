package com.kodnest.polymorphism;

public class B {
	public static void main(String[] args)
	{
		Color c=new Red();
		c.display();
		Red r=(Red)c;
		r.display();
		
	
	}

	

}
