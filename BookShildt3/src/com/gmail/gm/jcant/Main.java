package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		SomeInterface sif;
		SomeClass scl = new SomeClass();

		//оба метода доступны как из интерфейса:
		sif = scl;
		//sif.clear();
		System.out.println(sif.getNumber());
		System.out.println(sif.getString());
		
		//так и из класса:
		System.out.println(scl.getNumber());
		System.out.println(scl.getString());
		
		

	}

}
