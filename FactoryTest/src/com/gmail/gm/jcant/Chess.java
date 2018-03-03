package com.gmail.gm.jcant;

public class Chess implements Game {
	private static final int MOVES = 4;
	private int moves = 0;

	@Override
	public boolean move() {
		System.out.println("Chess move " + moves);
		return ++moves != MOVES;
	}
}
