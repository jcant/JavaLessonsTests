package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		
		Ass1 as1 = new Ass1();
		Ass2 as2 = new Ass2();
		
		as1.func1(10);
		as1.func2(10);
		
		System.out.println();
		as2.func1(20);
		as2.func2(20);
		System.out.println(as2.func3(20));
		
		//as1.func1(11.11);
		as1.func2(22.22);

	}

}
