package com.kodnest.arrays;
import java.util.*;

public class Program2 {
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		int size=s.nextInt();
		int[] arr=new int[size];
		/*System.out.println("enter array elements:");
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=s.nextInt();
		}
		
		System.out.print("Even elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2==0)
			{
				
				System.out.print(arr[i]+" ");
			}
			
		}
		System.out.println();
		System.out.print("odd elements are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%2!=0)
			{
				
				System.out.print(arr[i]+" ");
			}
		
		}
		System.out.println();
		System.out.print("even index elements  are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}
		System.out.println();
		System.out.print("Odd index elements  are: ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0)
			{
				
				System.out.print(arr[i]+" ");
			}
		}
		// 
// not divi by 3 and divi by 4, elements present in even index and % 4, present in odd index not divisible by 3
		// both 2and 3 % present in even index
		// ele that are multiple of 5 present in even index and not divi by 3.
		System.out.println();
		System.out.print("not divi by 3 and divi by 4: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%3!=0 && arr[i]%4==0)
			{
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		System.out.print("elements present in even index and % 4: ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0 && arr[i]%4==0)
			{
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		System.out.print("present in odd index not divisible by 3: ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2!=0 && arr[i]%3!=0)
			{
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		System.out.print("both 2and 3 % present in even index: ");
		for(int i=0;i<arr.length;i++)
		{
			if(i%2==0 && arr[i]%2==0 && arr[i]%3==0)
			{
				System.out.print(arr[i]);
			}
			
		}
		System.out.println();
		System.out.print("ele that are multiple of 5 present in even index and not divi by 3: ");
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]%5==0 && i%2==0 && arr[i]%3!=0)
			{
				System.out.print(arr[i]);
			}
			
		}/*/
		for(int i=0;i<size;i++)
		{
			arr[i]=s.nextInt();
		}
		System.out.print("Marks of students are:");
		for(int i=0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		
		
	}

}
