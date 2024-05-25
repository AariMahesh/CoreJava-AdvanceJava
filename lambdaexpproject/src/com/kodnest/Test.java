package com.kodnest;
@FunctionalInterface
interface Cab
{
	void bookCab();
}
class Ola implements Cab  {
	

	@Override
	public void bookCab() {
		// TODO Auto-generated method stub
		System.out.println("ola cab is booked");
		
	}
	

}
public class Test
{
	public static void main() {
		// TODO Auto-generated method stub
		Ola o=new Ola();
		o.bookCab();

	}
}
