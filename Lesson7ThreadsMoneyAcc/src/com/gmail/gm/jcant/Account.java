package com.gmail.gm.jcant;

public class Account {

	private int money;
	private String login;
	private long password;

	public Account(int money, String login, long password) {
		super();
		this.money = money;
		this.login = login;
		this.password = password;
	}

	public synchronized void takeMoney(String login, long password, int sum) {
		if (!checkPasswordAndLogin(login, password)) {
			System.out.println("Wrong login or password!");
			return;
		}
		if (!checkMoney(sum)) {
			System.out.println("You don't have money!");
			return;
		}
		transaction();
		changeBallance(sum);
		System.out.println(this);
	}

	private boolean checkPasswordAndLogin(String login, long password) {
		return (login.equals(this.login) && this.password == password);
	}

	private boolean checkMoney(int money) {
		return this.money >= money;
	}

	private void transaction() {
		try {
			Thread.sleep(500);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	private void changeBallance(int money) {
		this.money -= money;
	}

	@Override
	public String toString() {
		return "Account [money=" + money + "]";
	}
}
