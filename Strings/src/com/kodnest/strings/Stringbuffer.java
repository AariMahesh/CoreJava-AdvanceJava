package com.kodnest.strings;

public class Stringbuffer {
	public static void main(String[] args)
	{
		/*StringBuffer s=new StringBuffer("1234");
		System.out.println(s);
		s.append("345");
		System.out.println(s);
		StringBuilder s1=new StringBuilder("1234");
		System.out.println(s1);
		s1.append("345");
		System.out.println(s1);
		String s2="mahesh";
		StringBuffer s3=new StringBuffer(s2);
		StringBuilder s4=new StringBuilder(s2);
		s3.append(" Niadu");
		System.out.println(s3);
		String s5=new String(s3);
		String s6=s5.concat(" Aari");
		System.out.println(s6);*/
		String s="welcome to java";
		
		/*for(int i=0;i<ch.length;i++)
		{
			for(int j=0;j<ch[i].length();j++)
			{
				if(j==0)
				{
					System.out.print(ch[i].toUpperCase());
				}
			}
		}*/
		char[] c=s.toCharArray();
		int left=0;
		int right=s.length()-1;
		while(left<=right)
		{
			if(c[left]!=' '&&c[right]!=' ')
			{
				char temp=c[left];
				c[left]=c[right];
				c[right]=temp;
				left++;
				right--;
						
			}
			else if(c[left]==' ')
			{
				left++;
			}
			else
			{
				right--;
			}
		}
		System.out.println(new String(c));
	}

}
