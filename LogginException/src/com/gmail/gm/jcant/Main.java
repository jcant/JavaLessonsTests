package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		try {
			throw new NullPointerException();
		} catch (NullPointerException e) {
			LogginExceptions.logException(e);
			e.printStackTrace();
		}

	}

}
