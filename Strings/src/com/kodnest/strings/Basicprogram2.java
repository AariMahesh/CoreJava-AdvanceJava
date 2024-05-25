package com.kodnest.strings;

public class Basicprogram2 {
	public static void main(String[] args)
	{
		//String s="abcdefghijklmnopQrstuvwxxyz";
		//System.out.println(s.length());
		/*String[] sp=s.split(" ");
		int l=0;
		String s1="";
		for(int j=0;j<sp.length;j++)
		{
			if(l<sp[j].length())
			{
				l=sp[j].length();
				s1=sp[j];
			}
		}*/
		/*boolean b=false;
		int c=0;
		System.out.println((char)65);
		for(int i=0;i<26;i++)
		{
			
			if(s.contains(""))
			{
				System.out.println((char)65+i);
				c++;
			}
			else if(s.contains("(char)(97+i)"))
			{
				System.out.println((char)97+i);
				c++;
			}
		}
		if(c==26)
		{
			b=true;
		}
		System.out.println(b);
	}*/
		/*String s="Mahesh";
		for(int i=0;i<s.length();i++)
		{
			for(int j=1+i;j<s.length()+1;j++)
			{
				System.out.println(s.substring(i,j));
			}
		}
		String b="";
		for(int i=s.length()-1;i>=0;i--)
		{
			b=b+s.charAt(i);
		}
		System.out.println(b);*/
		String s="the is mahesh";
		String[] ch=s.split(" ");
		for(int i=0;i<ch.length;i++)
		{
			char[] c=ch[i].toCharArray();
			

		}
	}
}
