package com.gmail.gm.jcant;

import java.util.Arrays;
import java.util.Map;

public class Main {

	public static void main(String[] args) {

		for(Map.Entry entry: System.getenv().entrySet()) {
			System.out.println(entry.getKey()+": "+entry.getValue());
		}

	}

}
