package com.kodnest.polymorphism;
class Shape
{
	void draw()
	{
		System.out.println("Drawing a shape");
	}
	void draw1()
	{
		System.out.println("Drawing a shape");
	}
}
class Rectangle extends Shape
{
	void draw()
	{
		System.out.println("Drawing a rectangle");
	}
	void draw2()
	{
		System.out.println("Drawing a shape1");
	}
}
class Circle extends Rectangle
{
	void draw()
	{
		System.out.println("Drawing a circle");
	}
}

public class App {
	public static void main(String[] args)
	{
		Shape s=new Shape();
		s.draw();
		s=new Rectangle();
		s.draw();
		s.draw1();
		Rectangle r=new Rectangle();
		r.draw();
		Circle c=new Circle();
		c.draw();
		
		
	}

}
