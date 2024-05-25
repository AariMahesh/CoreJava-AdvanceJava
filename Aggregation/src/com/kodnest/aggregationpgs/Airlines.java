package com.kodnest.aggregationpgs;

public class Airlines
{
	String airName;
	Pilot p;
	public Airlines(String name,Pilot p)
	{
		this.airName=name;
		this.p=p;
	}
	public void operate()
	{
		System.out.println(airName+" operating");
		p.fly();
	}
//String airName="INDIGO";
//String Pname="Mahesh";
//Pilot p=new Pilot();

}
