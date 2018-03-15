package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		Action action = new Action();

		Provider prov = new Provider(action);
		Receiver rec = new Receiver(action);

		Thread thr1 = new Thread(prov);
		Thread thr2 = new Thread(rec);

		thr1.start();
		thr2.start();
	}

}
