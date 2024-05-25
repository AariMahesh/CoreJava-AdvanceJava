package com.kodnest.aggregationpgs;

public class Pilot {
	
	
	String Name;
	public Pilot(String Name)
	{
		this.Name=Name;
	}
	public void fly()
	{
		System.out.println(Name+" is Flying the plane");
	}

}

