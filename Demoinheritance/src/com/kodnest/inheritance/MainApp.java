package com.kodnest.inheritance;

public class MainApp {
	public static void main(String[] args)
	{
		StudentBot s=new StudentBot();
		TrainerBot b=new TrainerBot();
		s.write();
		s.skillSet();
		s.reading();
		b.teaching();
		b.reading();
		b.write();
		
		
	}

}
