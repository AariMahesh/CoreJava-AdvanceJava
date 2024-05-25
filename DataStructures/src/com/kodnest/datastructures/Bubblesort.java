package com.kodnest.datastructures;
import java.util.*;
public class Bubblesort {
public static void main(String[] args)
{
	Scanner s=new Scanner(System.in);
	int size=s.nextInt();
	int[] arr=new int[size];
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=s.nextInt();
	}
	bubbleSort(arr);
}
public static void bubbleSort(int[] arr)
{
	int n=arr.length;
	int temp=0;
	int it=0;
	int cc=0;
	for(int i=0;i<n;i++)
	{
		it++;
		for(int j=1;j<(n-1-1);j++)
		{
			temp=arr[j-1];
			arr[j-1]=arr[j];
			arr[j]=temp;
			cc++;
		}
	}
	System.out.print("To sort this arr using bubble sort it takes"+it+"iterations and"+cc+"comparisions to sort this"+Arrays.toString(arr));
}
}
