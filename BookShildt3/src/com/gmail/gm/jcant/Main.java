package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

		SomeInterface sif;
		SomeClass scl = new SomeClass();

		//��� ������ �������� ��� �� ����������:
		sif = scl;
		//sif.clear();
		System.out.println(sif.getNumber());
		System.out.println(sif.getString());
		
		//��� � �� ������:
		System.out.println(scl.getNumber());
		System.out.println(scl.getString());
		
		

	}

}
