package com.kodnest;
@FunctionalInterface
interface Cab
{
	String bookCab();
}
//class Ola implements Cab
//{
//
//	@Override
//	public void bookCab() {
//		// TODO Auto-generated method stub
//		System.out.println("cab booked...");
//	}
//	
//}
public class Example1 {
	public static void main(String[] args) {
		//System.out.println("hello");
		// no return statement
		//Cab o=()-> System.out.print("cab");
		//multiple return
		Cab o=()-> {System.out.println("ola car booked");
		return "from chennai to banglore";
		};
		System.out.println(o.bookCab());
		
	}
}
