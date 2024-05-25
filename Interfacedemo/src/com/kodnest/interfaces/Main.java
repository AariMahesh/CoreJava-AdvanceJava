package com.kodnest.interfaces;
interface Student
{
	void show();
}
class CSS implements Student
{
	public void show()
	{
		System.out.println("welcome");
	}
}

public class Main
{
	public static void main(String[] args)
	{
		CSS c=new CSS();
		c.show();
		//c.display();
	}
	
	

}
