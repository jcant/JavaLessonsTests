package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		BaseClass bc = new BaseClass();
		
		bc.x_default = 100;
		bc.x_protected = 200;
		bc.x_public = 300;
		
		SubClass sc = new SubClass();
		
		sc.x_default = 400;
		sc.x_protected = 500;
		sc.x_public = 600;
		
		com.gmail.gm.jcant2.SubClass sc2 = new com.gmail.gm.jcant2.SubClass();
		
		sc2.x_protected = 700;
		sc2.x_public = 800;

	}

}
