package com.kodnest.arraysols;

public class Program2 {
	public static void main(String[] args)
	{
		int[][] a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][] b=new int[3][3];
		
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				b[j][i]=a[i][j];
				
			}
			
		}
		for(int i=0;i<b.length;i++)
		{
			for(int j=0;j<b[i].length;j++)
			{
				System.out.print(b[i][j]);
				
			}
			System.out.println();
		}
		int[] arr= {1,2,3};
		int[] c=new int[arr.length];
		for(int i=0;i<arr.length;i++)
		{
			c[arr.length-1-i]=arr[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
		for
		
		
	}

}
