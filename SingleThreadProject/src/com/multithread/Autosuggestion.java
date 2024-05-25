package com.multithread;

public class Autosuggestion extends Thread {
	public void run()
	{
		for(;;)
		{
			try
			{
				Thread.sleep(1000);
			}
			catch(Exception e)
			{
				System.out.println(e);
			}
			System.out.println("suggesting");
		}
		
	}

}
