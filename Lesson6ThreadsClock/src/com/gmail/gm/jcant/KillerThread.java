package com.gmail.gm.jcant;

public class KillerThread implements Runnable {

	public KillerThread() {
		super();

	}

	@Override
	public void run() {

		Thread clock = new Thread(new ClockThread());
		clock.start();

		int num = (int) (Math.random() * 10);

		while (num != 5) {
			System.out.println(num);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}

			num = (int) (Math.random() * 10);
		}

		System.out.println(num);
		clock.interrupt();
		System.out.println("Killer thread stoped!");
	}

}
