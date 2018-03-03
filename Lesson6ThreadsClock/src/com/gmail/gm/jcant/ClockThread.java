package com.gmail.gm.jcant;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ClockThread implements Runnable {

	SimpleDateFormat format;

	public ClockThread() {
		super();

		format = new SimpleDateFormat("HH:mm:ss");
	}

	public ClockThread(SimpleDateFormat format) {
		super();
		format = new SimpleDateFormat("format");
	}

	@Override
	public void run() {

		Thread th = Thread.currentThread();

		while (!th.isInterrupted()) {
			System.out.println(format.format(new Date()));

			try {
				Thread.sleep(250);
			} catch (InterruptedException e) {
				break;
			}
		}

		System.out.println("Clock thread stopped!");

	}

}