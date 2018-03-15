package com.gmail.gm.jcant;

public class SingleThread implements Runnable {
	private SomeClass1 some;

	public SingleThread(SomeClass1 some) {
		super();
		this.some = some;
	}

	@Override
	public void run() {

		int x = some.volume++;
		System.out.println("*" + x);

	}

}
