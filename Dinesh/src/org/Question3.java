package org;

public class Question3 {
	public static void main(String[] args)
	{
		String str="Devendra";
		for(int i=1;i<str.length();i++)
		{
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				System.out.println("vowel is present");
				break;
			}
			else
			{
				System.out.println("vowel is not present");
			}
		}
	}

}
