package com.gmail.gm.jcant;

public class Main {

	public static void main(String[] args) {

//		playGame(new CheckersFactory());
//		playGame(new ChessFactory());
		
		
		Game[] games = new Game[] {new Checkers(), new Chess(), new Chess(), new Checkers()};
		
		for (Game game : games) {
			playGame(game);
		}

	}

//	public static void playGame(GameFactory factory) {
//		Game s = factory.getGame();
//
//		while (s.move()) {
//		}
//
//	}
	
	public static void playGame(Game game) {
		while (game.move()) {
		}

	}

}
