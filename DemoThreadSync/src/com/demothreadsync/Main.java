package com.demothreadsync;

public class Main {
	public static void main(String[] args) {
		Hospital hs=new Hospital();
		Thread th=new Thread(hs);
		
		th.setName("enginer");
		th.start();
		Thread th1=new Thread(hs);
		th1.setName("layer");
		th1.start();
		
	}

}
class Hospital implements Runnable
{
	//resource
	@Override
	public synchronized void run()
	{
		try
		{
			String str=Thread.currentThread().getName();
			System.out.println(str+" is in ICu");
			Thread.sleep(2000);
		    System.out.println(str+" is getting treatment");
		    Thread.sleep(2000);
		    System.out.println(str+" is discharged");
		}
		catch(Exception e)
		{
			//e.printStackTrace();
			System.out.println("exception Handled");
		}
		
	}
}