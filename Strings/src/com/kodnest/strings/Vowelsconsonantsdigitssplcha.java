package com.kodnest.strings;

public class Vowelsconsonantsdigitssplcha {
	public static void main(String[] args)
	{
		/*String s="My name is 1 mahesh!";
		s.toLowerCase();
		char[] ch=s.toCharArray();
		int vowels=0;
		int con=0;
		int digi=0;
		int spl=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]=='a'||ch[i]=='e'||ch[i]=='i'||ch[i]=='0'||ch[i]=='u')
			{
				vowels++;
			}
			else if(ch[i]>='0'&&ch[i]<='9')
			{
				digi++;
			}
			else if(ch[i]>='a'&&ch[i]<'z')
			{
				con++;
			}
			else
			{
				spl++;
			}
		}
		System.out.println(s.length());
		System.out.println(digi);
		System.out.println(vowels);
		System.out.println(con);
		System.out.println(spl);*/
		//one occurence of first character in string
		String s="Programming";
		for(int i=0;i<s.length();i++)
		{
			char temp=s.charAt(i);
			int cou=0;
			for(int j=0;j<s.length();j++)
			{
				if(s.charAt(i)==s.charAt(j))
				{
					cou++;
				}
			}
			if(cou==1)
			{
				System.out.println(temp);
				break;
			}
		}
	}

}
