package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {
		
		playGame(Checkers.factory);
		playGame(Chess.factory);

	}

	public static void playGame(GameFactory factory) {
		Game s = factory.getGame();
		while (s.move()) {
		}
	}

}
