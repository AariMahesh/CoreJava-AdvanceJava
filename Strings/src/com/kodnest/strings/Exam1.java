package com.kodnest.strings;

public class Exam1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<6;i++)
		{
			for(int j=0;j<6-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		for(int j=2;j<=6;j++)
		{
			for(int i=0;i<j;i++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
