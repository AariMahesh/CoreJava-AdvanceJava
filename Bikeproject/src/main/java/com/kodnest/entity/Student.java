package com.kodnest.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
@Entity
public class Student {
	@Id
    int Sid;
	String Sname;
	@OneToOne
	Bike bike;
	public Student(int id,String name,Bike bike)
	{
		super();
		this.Sid=id;
		this.Sname=name;
		this.bike=bike;
		
	}
	public Student()
	{
		super();
	}
	public void setId(int id)
	{
		this.Sid=id;
	}
	public void setName(String Name)
	{
		this.Sname=Name;
	}
	public int getId()
	{
		return this.Sid;
	}
	public String getName()
	{
		return this.Sname;
	}
	public void setBike(Bike bike)
	{
		this.bike=bike;
	}
	public Bike getBike()
	{
		return bike;
	}
	public String toString()
	{
		return "Employee [id="+Sid+", name="+Sname+"]"+"bike "+bike;
	}
	
	

}
