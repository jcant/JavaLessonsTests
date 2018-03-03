package com.gmail.gm.jcant;

public interface SomeInterface {
	int getNumber();

	default String getString() {
		return "This is the string from SomeInterface";
	}
	
	default void clear() {
		throw new UnsupportedOperationException("clear() is not realized for your class!");
	}
}
