package com.multithread;

public class Autocorrection extends Thread {
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
			System.out.println("correcting");
		}
		
	}

}
