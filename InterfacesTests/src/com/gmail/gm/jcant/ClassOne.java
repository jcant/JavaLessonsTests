package com.gmail.gm.jcant;

public class ClassOne implements GetString{

	private int intField;
	private String stringField;
	
	
	public ClassOne() {
		super();
	}


	public ClassOne(int intField, String stringField) {
		super();
		this.intField = intField;
		this.stringField = stringField;
	}


	public int getIntField() {
		return intField;
	}


	public void setIntField(int intField) {
		this.intField = intField;
	}


	public String getStringField() {
		return stringField;
	}


	public void setStringField(String stringField) {
		this.stringField = stringField;
	}


	@Override
	public String toString() {
		return "ClassOne [intField=" + intField + ", stringField=" + stringField + "]";
	}


	public String getString() {
		
		return "ClassOne have string: "+this.stringField;
	}



}
