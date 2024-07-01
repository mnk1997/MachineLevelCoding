package com.example.boardgamecreation;

public class SnakeLadderBoardGame extends BoardGame{
   

    public SnakeLadderBoardGame(String boardGameName) {
        this.boardGameName = boardGameName;
    }

 

    public void playGame() {
        //Implement logic for playing Snake & Ladder
        System.out.println("Playing Snake & Ladder");
    }

    public GameType gameType() {
        return GameType.SNAKE_LADDER;
    }
}
