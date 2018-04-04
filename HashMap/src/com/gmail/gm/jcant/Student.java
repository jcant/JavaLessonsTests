package com.gmail.gm.jcant;

public class Student {
	String FIO;
	String facultet;
	int cource;
	double oc;

	public Student(String fIO, String facultet, int cource, double oc) {
		super();
		FIO = fIO;
		this.facultet = facultet;
		this.cource = cource;
		this.oc = oc;
	}

	@Override
	public String toString() {
		return "Student [FIO=" + FIO + ", facultet=" + facultet + ", cource=" + cource + ", oc=" + oc + "]";
	}

}
