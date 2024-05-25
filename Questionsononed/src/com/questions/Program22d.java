package com.questions;
import java.util.*;

public class Program22d 
{
	public static void majn(String[] args)
	{
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int size1=s.nextInt();
	
	/*int [][][] arr=new int[2][][];
	arr [0]=new int[3][];
	arr [0][0]=new int[3];
	arr [0][1]=new int[2];
	arr [0][1]=new int[1];
	arr [1]=new int[2][];
	arr [1][0] = new int[3];
	arr [1][1]=new int[2];
	/*for(int i=0;i<arr.length;i++)
	{
		for(int k=0;k<arr[i].length;k++)
		{
			for(int j=0;j<arr[i][k].length;j++)
			{
				arr[i][k][j]=s.nextInt();
			}
			
		}
		
	}*/
	/*for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			for(int k=0;j<arr[i][j].length;k++)
			{
				System.out.print(arr[i][j][k]+" ");
			}
			System.out.println();
			
		}
		System.out.println();
	}*/
	int[][] arr=new int[size][size1];
	int[][] arr1=new int[size][size1];
	for(int i=0;i<arr.length;i++)
	{
		for(int j=0;j<arr[i].length;j++)
		{
			arr[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<arr1.length;i++)
	{
		for(int j=0;j<arr1[i].length;j++)
		{
			arr1[i][j]=s.nextInt();
		}
	}
	for(int i=0;i<size;i++)
	{
		int sum=0;
		for(int j=0;j<size1;j++)
		{
		 sum=arr[i][j]+arr1[i][j];
		 System.out.print(sum);
		 sum=0;
		}
		System.out.println();
	}
	
	}

}
