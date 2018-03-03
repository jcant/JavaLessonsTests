package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		Holder hld = new Holder(100);

		hld.Processing(s -> s.toUpperCase(), "happy new year!");

		hld.Processing(s -> {
			String result = "";
			for (int i = 0; i < s.length(); i++) {
				result = result + s.charAt(i) + "*";
			}
			return result;
		}, "happy new year!");

	}

	public static void doPrint(GetString gStrIF) {

	}

}
