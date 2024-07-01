package com.example.boardgamecreation;

public abstract class BoardGame {
	 protected String boardGameName;
    public abstract GameType gameType();
    public String getBoardGameName() {
        return boardGameName;
    }
    public abstract void playGame(); 
}
