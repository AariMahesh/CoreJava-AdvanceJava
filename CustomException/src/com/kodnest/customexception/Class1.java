package com.kodnest.customexception;
class Bank {
	int balace=1000;
	void debit()throws Insufficientbalance {
		balace-=400;
		if(balace<=0)
		{
			throw new Insufficientbalance();
		}
	}
}
class Insufficientbalance extends Exception{
	public Insufficientbalance()
	{
		System.out.println("insufficient funds,"+"try less anount next time");
	}
}
public class Class1 {
	
	public static void main(String[] args) throws Insufficientbalance {
		//usingInstagram();
		new Bank().debit();
		
	}
	

}
