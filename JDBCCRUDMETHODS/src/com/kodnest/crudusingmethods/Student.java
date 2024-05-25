package com.kodnest.crudusingmethods;
//POJO -plain old Java object
public class Student {
	private int id;
	private String name;
	public Student(int id,String name)
	{
		super();
		
	}
	public Student()
	{
		super();
	}
	public void setId(int id)
	{
		this.id=id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public int getId()
	{
		return id;
	}
	public String getName()
	{
		return name;
	}
//	public String toString()
//	{
//		return Student.id+" ";
//		
//	}
	

}
