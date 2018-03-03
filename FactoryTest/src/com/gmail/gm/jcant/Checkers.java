package com.gmail.gm.jcant;

public class Checkers implements Game {
	private static final int MOVES = 3;
	private int moves = 0;

	@Override
	public boolean move() {
		System.out.println("Checkers move " + moves);
		return ++moves != MOVES;
	}
}
