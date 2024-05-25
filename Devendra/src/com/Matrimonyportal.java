package com;

public class Matrimonyportal {
	public static void main(String[] args) {
		char gender='M';
		int age=23;
		if(gender=='M')
		{
			System.out.println("Gender is male");
			if(age>=21)
			{
				System.out.println("Gender is you can marry");
			}
			else
			{
				System.out.println("have patients");
			}
		}
		else if(gender=='F')
		{
			System.out.println("Gender is female");
			if(age>=18)
			{
				System.out.println("Gender is you can marry");
				}
			else
			{
				System.out.println("have patients");
			}
				
		}
		else
		{
			System.out.println("Invalid");
		}
		
	}

}
