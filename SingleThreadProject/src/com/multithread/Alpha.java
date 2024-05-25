package com.multithread;

public class Alpha implements Runnable{
	public void run()
	{
		//Thread th=Thread.currentThread();
		//System.out.println(th);
		
		for(int i=0;i<26;i++)
		{
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			System.out.println((char)(65+i));
		}
	}

}
