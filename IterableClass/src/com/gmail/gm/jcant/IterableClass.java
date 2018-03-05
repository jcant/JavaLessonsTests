package com.gmail.gm.jcant;

public class IterableClass {
	private String value;

	public IterableClass() {
		super();
	}

	public IterableClass(String value) {
		super();
		this.value = value;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	@Override
	public String toString() {
		return "IterableClass [value=" + value + "]";
	}
	
	
}
