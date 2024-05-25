package com.kodnest.object;

class Student {
	private String name;
	//private int age;
	private int id;
	private char grade;
	private boolean result;
	public void setName(String a)
	{
		this.name=a;
	}
	public void setId(int a)
	{
		this.id=a;
	}
	public void setGrade(char a)
	{
		this.grade=a;
	}
	public void setResult(boolean a)
	{
		this.result=a;
	}
	/*public void setAge(int a)
	{
		this.age=a;
	}*/
	
	public void getName()
	{
		System.out.println("Name: "+name);
	}
	 /*public void getAge()
	{
		System.out.println("age: "+age);
	}*/

}
public class MainApp
{
	public static void main(String[] args)
	{
	Student s=new Student();
	//s.setAge(24);
	s.setName("mahi");
	//s.getAge();
	s.getName();
	//System.out.println(s.age);
	}
}
