package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		Account account = new Account(200, "user", 123);
		
		SingleThread shOne = new SingleThread(account);
		SingleThread shTwo = new SingleThread(account);
		
		shOne.getMoneyFromAccount("user", 123, 180);
		shOne.getMoneyFromAccount("user", 123, 180);

	}

}
