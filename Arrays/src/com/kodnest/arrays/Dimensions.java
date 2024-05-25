package com.kodnest.arrays;
import java.util.*;

public class Dimensions {
	public static void main(String[] args)
	{
	// 1 d
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int [][] arr=new int[size][size];
;	/*for(int i=0;i<size;i++)
	{
		arr[i]=s.nextInt();
	}
	System.out.print("Marks of students are:");
	System.out.print(arr);
	for(int i=0;i<arr.length;i++)
	{
		System.out.print(arr[i]);
	}*/
for(int i=0;i<size;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		arr[i][j]=s.nextInt();
	}
}
for(int i=0;i<size;i++)
{
	for(int j=0;j<arr.length;j++)
	{
		System.out.print(arr[i][j]);
	}
	System.out.println();
}
    
}

}
