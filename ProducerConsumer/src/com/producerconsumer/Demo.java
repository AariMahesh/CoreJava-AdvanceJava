package com.producerconsumer;

public class Demo 
{
	public static void main(String[] args) {
		Factory fa=new Factory();
		Producer pr=new Producer(fa);
		Consumer cs=new Consumer(fa);
		Thread t1=new Thread(pr);
		//t1.setName("produced");
		t1.start();
		Thread t2=new Thread(cs);
		
		t2.start();
		
	}
}
class Producer implements Runnable
{
	Factory f;
	public Producer(Factory f)
	{
		this.f=f;
	}
	@Override
	public synchronized void run()
	{
		int i=0;
		while(true)
		{
			f.produce(i++);
			//System.out.println("produced");
		}
		
	}
}
class Consumer implements Runnable
{
	Factory f;
	public Consumer(Factory f)
	{
		this.f=f;
	}
	public synchronized void run()
	{
		
			f.consume();
		
		//System.out.println("Consuming")
	}
	
}
class Factory
{
	int i;
	boolean status=false;
	public synchronized void produce(int i)

	{
		try
		{
			if(!status)
			{
				
			}
		}
		this.i=i;
		System.out.println("produced item "+i);	
	}
	public synchronized void consume()
	{
		System.out.println("Consuming item "+i);
	}
}