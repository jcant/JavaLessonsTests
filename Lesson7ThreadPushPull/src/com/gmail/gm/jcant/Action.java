package com.gmail.gm.jcant;

public class Action {

	private boolean turn = false;
	private boolean stop = false;

	public Action() {
		super();
	}

	public synchronized void printReciever(String text) {
		while (turn == false) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		turn = false;

		notifyAll();
		System.out.println(text);
	}

	public synchronized void printProvider(String text) {
		while (turn == true) {
			try {
				wait();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}

		turn = true;
		System.out.println(text);
		notifyAll();
	}

	public boolean isStop() {
		return stop;
	}

	public void setStop(boolean stop) {
		this.stop = stop;
	}
}
