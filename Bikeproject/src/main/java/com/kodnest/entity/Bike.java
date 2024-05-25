package com.kodnest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Bike {
	@Id
	private int Bid;
	private String Bname;
	public Bike(int id,String name)
	{
		super();
		this.Bid=id;
		this.Bname=name;
	}
	public Bike()
	{
		super();
	}
	public void setId(int id)
	{
		this.Bid=id;
	}
	public void setName(String Name)
	{
		this.Bname=Name;
	}
	public int getId()
	{
		return this.Bid;
	}
	public String getName()
	{
		return this.Bname;
	}
	public String toString()
	{
		return "Bike [id="+Bid+", name="+Bname+"]";
	}

}

