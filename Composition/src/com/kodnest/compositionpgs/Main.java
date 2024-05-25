package com.kodnest.compositionpgs;
class Page
{
	String content;
	public Page(String content)
	{
		this.content=content;
	}
	void displayContent()
	{
		System.out.print("content");
	}
}
class Book
{
	Page p;
	//String content;
	public Book(String content)
	{
		this.p= new Page(content);
		
	}
	void readPage()
	{
		System.out.println("reading pages");
	}
}

public class Main {
	public static void main(String[] args)
	{
	Book b=new Book("this is book");
	b.readPage();
	b=null;
	
	}

}
