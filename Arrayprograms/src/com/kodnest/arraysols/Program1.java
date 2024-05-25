package com.kodnest.arraysols;
import java.util.*;

public class Program1 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int[][] arr=new int[a][b];
		
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr[i].length;j++)
			{
				arr[i][j]=s.nextInt();
			}
		}
		int m=arr.length-1;
		int n=arr[0].length-1;
		int i=0;
		for(int j=0;j<=n;j++)
		{
			System.out.print(arr[i][j]+" ");
		}
		int j=n;
		for(int k=1;k<=m;k++)
		{
			System.out.print(arr[k][j]+" ");
		}
		if(m>1)
		{
			int l=m;
			for(int r=m-1;r>=0;r--)
			{
				System.out.print(arr[r][l]);
			}
	
		}
		if(n>1)
		{
			int o=0;
			for(int p=m-1;p>=1;p--)
			{
				System.out.print(arr[p][o]);
			}
			
		}
	}

}
