package com.gmail.gm.jcant;

public class SingleThread2 implements Runnable {
	private SomeClass2 some;

	public SingleThread2(SomeClass2 some) {
		super();
		this.some = some;
	}

	@Override
	public void run() {

		int x = some.volume.incrementAndGet();
		System.out.println(" " + x);

	}

}
