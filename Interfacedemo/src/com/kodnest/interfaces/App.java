package com.kodnest.interfaces;
interface StudentActivity
{
	void sleep();
	void eat();
	void study();
	
}
class ComputerScienceStudent implements StudentActivity
{

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		System.out.println("Sleeping.....");
		
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("Eating.....");
		
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		System.out.println("Studying......");
	}
	
}

public class App
{
	public static void main(String[] args) 
	{
		ComputerScienceStudent cse=new ComputerScienceStudent();
		cse.eat();
		cse.study();
		cse.sleep();
	}

	

}
