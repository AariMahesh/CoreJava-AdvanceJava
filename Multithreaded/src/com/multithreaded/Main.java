package com.multithreaded;

public class Main {
	public static void main(String[] args) {
		//Thread t=Thread.currentThread();
		//System.out.println(t);
		System.out.println(Thread.currentThread().isAlive());
		System.out.println("main() STart");
		Solution s=new Solution();
		Thread th=new Thread(s);
		System.out.println(th.isAlive());
		th.start();
		try {
			th.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(th.isAlive());
		System.out.println(Thread.currentThread().isAlive());
	}

}
