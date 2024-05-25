package com.kodnest.datastructures;
import java.util.*;

public class Binearysearch {
	public static void main(String[] args)
	{
		Scanner scan=new Scanner(System.in);
		int size=scan.nextInt();
		int[] arr=new int[size];
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
		}
		int tar=scan.nextInt();
		int res=binearSearch(arr,tar);
		if(res==1)
		{
			System.out.println("element found");
		}
		else
		{
			System.out.println("element not found in array");
		}
	}
	public static int binearSearch(int[] arr,int tar)
	{
		Arrays.sort(arr);
		int low=0;
		int mid=(low+arr.length-1)/2;
		int high=arr.length-1;
		while(low<=high)
		{
			if(tar==arr[mid])
			{
				return 1;
			}
			else if(tar<arr[mid])
			{
				high=mid-1;
				mid=(low+high)/2;
			}
			else
			{
				low=mid+1;
				mid=(low+high)/2;
			}
			
		}
		return -1;
	}

}
