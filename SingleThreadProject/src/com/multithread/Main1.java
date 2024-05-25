package com.multithread;

public class Main1 {
	public static void main(String[] args) {
			Typing t=new Typing();
			Autosuggestion au=new Autosuggestion();
			Autocorrection ac=new Autocorrection();
			//t.setDaemon(true);
			au.setDaemon(true);
			ac.setDaemon(true);
			au.setPriority(1);
			ac.setPriority(1);
			t.start();
			au.start();
			ac.start();
			
	}

}
