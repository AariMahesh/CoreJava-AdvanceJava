package com.multithread;

public class Numbers implements Runnable {
public void run()
{
	//Thread th=Thread.currentThread();
	//System.out.println(th);
	
	for(int i=0;i<=10;i++)
	{
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}
		System.out.println(i);
	}
}
}
