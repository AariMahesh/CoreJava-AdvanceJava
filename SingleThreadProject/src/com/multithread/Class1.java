package com.multithread;

public class Class1 {
	public static void main(String[] args) {
		System.out.println(Thread.currentThread());
		Class2 c=new Class2();
		c.start();
	}

}
class Class2 extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
	}
}
class Class3 extends Thread
{
	public void run()
	{
		Thread t=Thread.currentThread();
		System.out.println(t);
	}
}