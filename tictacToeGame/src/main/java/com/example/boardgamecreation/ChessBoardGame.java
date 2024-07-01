package com.example.boardgamecreation;

public class ChessBoardGame extends BoardGame{
   
    public ChessBoardGame(String boardGameName) {
        this.boardGameName = boardGameName;
    }

  

    public void playGame() {
        //Implement logic for playing Chess
        System.out.println("Playing Chess");
    }

    public GameType gameType() {
        return GameType.CHESS;
    }
}
