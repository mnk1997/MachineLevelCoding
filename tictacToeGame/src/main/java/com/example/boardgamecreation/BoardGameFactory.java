package com.example.boardgamecreation;

public class BoardGameFactory {
	
	public static BoardGame createBoardGame(GameType type,String gameName)
	{
		if(type.equals(GameType.SNAKE_LADDER))
			return new SnakeLadderBoardGame(gameName);
		else if(type.equals(GameType.CHESS))
			return new ChessBoardGame(gameName);
		else 
			return new TicTacToeBoardGame(gameName);
	}
}
