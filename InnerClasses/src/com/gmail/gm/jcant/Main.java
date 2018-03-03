package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		Sequence sequence = new Sequence(10);
		
		for (int i = 0; i < 10; i++) {
			sequence.add(i);
		}
		Selector selector = sequence.getSelector();
		while(!selector.end()) {
			System.out.print(selector.current() + " ");
			selector.next();
		}

	}

}
