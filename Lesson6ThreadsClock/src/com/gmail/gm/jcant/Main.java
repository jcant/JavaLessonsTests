package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		Thread killer = new Thread(new KillerThread());
		
		killer.start();
		
	}

}
