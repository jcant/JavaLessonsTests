package com.gmail.gm.jcant;

public class ChessFactory implements GameFactory {

	@Override
	public Game getGame() {
		return new Chess();
	}
}
