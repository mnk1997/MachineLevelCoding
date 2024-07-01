package com.example.boardgamecreation;

public class TicTacToeBoardGame extends BoardGame {
  
    public TicTacToeBoardGame(String boardGameName) {
        this.boardGameName = boardGameName;
    }



    public void playGame() {
        //Implement logic for playing Tic Tac Toe
        System.out.println("Playing Tic Tac Toe");
    }

    @Override
    public GameType gameType() {
        return GameType.TIC_TAC_TOE;
    }
}
