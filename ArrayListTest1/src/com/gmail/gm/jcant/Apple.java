package com.gmail.gm.jcant;

public class Apple {
	private String name;

	public Apple(String name) {
		this.name = name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public String toString() {
		return "Apple(): name = " + name;
	}
}
