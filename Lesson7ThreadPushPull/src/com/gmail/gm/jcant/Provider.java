package com.gmail.gm.jcant;

public class Provider implements Runnable {
	private Action action;

	private String text = "Push";

	public Provider(Action action) {
		super();
		this.action = action;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			action.printProvider(text);

		}

		action.setStop(true);
	}

}
