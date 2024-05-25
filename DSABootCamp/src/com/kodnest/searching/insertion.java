package com.kodnest.searching;

import java.util.Arrays;

public class insertion {
	public static void main(String[] args) {
		int[] arr= {7,8,3,1,2};
		for(int i=1;i<arr.length;i++)
		{
			int c=arr[i];
			int j=i-1;
			while(j>=0 && c<arr[j])
			{
				arr[j+1]=arr[j];
				j--;
			}
			arr[j+1]=c;
			
		}
		System.out.println(Arrays.toString(arr));
	}

}
