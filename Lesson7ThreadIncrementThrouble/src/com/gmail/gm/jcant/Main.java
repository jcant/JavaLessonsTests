package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		SomeClass1 sm1 = new SomeClass1();
		SomeClass2 sm2 = new SomeClass2();
		
		for (int i=0; i<10; i++) {
			Thread th = new Thread(new SingleThread(sm1));
			th.start();
		}
		

		for (int i=0; i<10; i++) {
			Thread th = new Thread(new SingleThread2(sm2));
			th.start();
		}
	}

}
