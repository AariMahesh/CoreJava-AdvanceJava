package com.kodnest.searching;

import java.util.Arrays;

public class selection {
	public static void main(String[] args) {
		int[] arr= {7,8,3,1,2};
		for(int i=0;i<arr.length-1;i++)
		{
			int small=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[small]>arr[j])
				{
					small=j;
				}
			}
			int temp=arr[small];
			arr[small]=arr[i];
			arr[i]=temp;
		}
		System.out.print(Arrays.toString(arr));
	}

}
