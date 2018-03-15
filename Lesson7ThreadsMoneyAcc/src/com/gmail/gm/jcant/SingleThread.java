package com.gmail.gm.jcant;

public class SingleThread implements Runnable {
	private Account account;
	private String login;
	private long password;
	private int sum;

	public SingleThread(Account account) {
		super();
		this.account = account;
	}

	public void getMoneyFromAccount(String login, long password, int sum) {
		this.login = login;
		this.password = password;
		this.sum = sum;
		Thread thr = new Thread(this);
		thr.start();
	}

	@Override
	public void run() {
		account.takeMoney(login, password, sum);
	}
}
