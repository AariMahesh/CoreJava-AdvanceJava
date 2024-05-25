package com.kodnest.strings;
import java.util.*;

public class Basicprogram {
	public static void main(String[] args)
	{
		/*String name="Mahesh;";
		System.out.println(name);
		// WAJP to print name and Adress
		String Add="1-6,ellapalli(v),chittoor,Andhra pradesh.";
		System.out.println(Add);
		// diff ways of creating string
		// 1st way String s="mahi";
		// 2nd way of creating string
		String s=new String("Mahi");
		// 3rd way
		char[] c= {'a','b'};
		String sc=new String(c);
		System.out.println(c);*/
		// string concetation
		Scanner s=new Scanner(System.in);
		/*String fstn=s.next();
		String lsth=s.next();
		
		String n="Mahesh";
		String a="Mahesh";
		System.out.println(n+a);
		// concat method
		System.out.println(n.concat(a));
		String concat=fstn.concat(lsth);
		System.out.println(concat);
		System.out.println(fstn.concat(" ")+concat);
		System.out.println(n==a);
		System.out.println(n.equals(a));
		System.out.println(n.length());*/
		String a=s.next();
		//String b=s.next();
		//String c=s.next();
		//System.out.println(a.compareTo(b));
		//System.out.println(b.compareTo(c));
		//System.out.println(a.compareToIgnoreCase(c));
		/*System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		System.out.println(a.replace("a","!"));
		System.out.println(a.startsWith("M"));
		System.out.println(a.startsWith("m"));
		System.out.println(a.endsWith("h"));
		System.out.println(a.substring(1,2));
		System.out.println(a.charAt(0));
		System.out.println(a.charAt(4));
		System.out.println(a.indexOf("h"));
		System.out.println(a.contains("ahe"));
		char[] cha=a.toCharArray();
		for(int i=0;i<cha.length;i++)
		{
			System.out.print(cha[i]+" ");
		}
		String s1="123 456";
		String[] str=s1.split(" ");
		
		for(int i=0;i<str.length;i++)
		{
			System.out.print(str[i]+" ");
		}
		String s2="saSdfgThnGsdfgd";
		String[] st=s2.split("[A-Z]");
		for(int i=0;i<st.length;i++)
		{
			System.out.print(st[i]+" ");
		}*/
		int[] arr= {3,3,4,7,8};
		int n=arr.length;
		int d=5;
		int res=countTr(arr,n,d);
		System.out.println(res);
		
	}
	public static int countTr(int[] arr,int n,int d)
	{
		int c=0;
		for(int i=0;i<n-2;i++)
		{
			for(int j=i+1;j<n-1;j++)
			{
				for(int k=j+1;k<n;k++)
				{
					if((arr[i]+arr[j]+arr[k])%d==0)
					{
						c++;
					}
				}
			}
		}
		return c;
	}

}
