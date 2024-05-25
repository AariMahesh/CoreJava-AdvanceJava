package com.kodnest.aggregationpgs;

public class Main {
	
	
		public static void main(String[] args)
		{
			Pilot p=new Pilot("mahesh");
			
			Airlines a=new Airlines("Indigo",p);
			a.operate();
			//a=null;
			//a.operate();
			p.fly();
			
		}
	
}
