package com.gmail.gm.jcant;

public class PrivateClass {

	private void prn() {
		System.out.println("In Private method of PrivateClass!");
	}
	
	public static void main(String[] args) {
		
		PrivateClass pc = new PrivateClass();
		ChildClass ch = new ChildClass();
		
		PrivateClass pcch = new ChildClass();
		
		pc.prn();
		ch.prn();
		pcch.prn();

	}

}
