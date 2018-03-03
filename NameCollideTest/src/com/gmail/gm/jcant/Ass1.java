package com.gmail.gm.jcant;

public class Ass1 implements Face1, Face2 {

	//public String func1(int i) {
	//	return "in Ass1::func1(int i) - i = " + i;
	//}

	//public String func2(int i) {
	//	return "in Ass1::func2(int i) - i = " + i;
	//}
	
	
//	public void func1(int i) {
//		System.out.println("interface1 realize in Ass1::func1(int i) - i = " + i);
//	}
	
//	public int func1(int i) {
//		return i*i;
//	}
	
	public void func2(int i) {
		System.out.println("interface1 realize in Ass1::func2(int i) - i = " + i);
	}

//	@Override
//	public void func1(double i) {
//		System.out.println("interface2 realize in Ass1::func1(double i) - i = " + i);
//		
//	}

	@Override
	public void func2(double i) {
		System.out.println("interface2 realize in Ass1::func1(double i) - i = " + i);
		
	}


}
