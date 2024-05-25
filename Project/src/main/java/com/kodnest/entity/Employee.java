package com.kodnest.entity;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	public Employee(int id,String name)
	{
		super();
		this.id=id;
		this.name=name;
	}
	public Employee()
	{
		super();
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String Name)
	{
		this.name=Name;
	}
	public int getId()
	{
		return this.id;
	}
	public String getName()
	{
		return this.name;
	}
	public String toString()
	{
		return "Employee [id="+id+", name="+name+"]";
	}

}
