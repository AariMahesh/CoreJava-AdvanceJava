package org;
import java.util.*;

public class Chocolate
{	
	public static void main(String[] args)
	{
		Scanner sch=new Scanner(System.in);
		int n=sch.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sch.nextInt();
		int count=0;
		for(int i=0;i<n;i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		for(int i=count;i<n;i++)
			arr[i]=0;
		for(int i=0;i<n;i++)
			System.out.println(arr[i]);
		sch.close();
	}
	

}
