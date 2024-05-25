package com.multithreaded;

class Solution implements Runnable{
	
	public void run()
	{
		
			for(int i=1;i<=5;i++)
			{
				System.out.println(i);
//				try {
//					Thread.sleep(2000,1000);
//				} catch (InterruptedException e) {
//					
//					e.printStackTrace();
//				}
				
			
		}
		
	} 

}
