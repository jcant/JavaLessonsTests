package com.gmail.gm.jcant;

public class Receiver implements Runnable {
	private Action action;
	
	private String text = "Pull";

	public Receiver(Action action) {
		super();
		this.action = action;
	}

	@Override
	public void run() {
		while (!action.isStop()) {
			action.printReciever(text);;
		}
	}
}
