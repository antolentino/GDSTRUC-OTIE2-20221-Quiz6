package com.gdstruc.module4;

public class Player {
    private int playerNum;

    public Player(int playerNum) {
        this.playerNum = playerNum;
    }

    public int getPlayerNum() {
        return playerNum;
    }

    public void setPlayerNum(int playerNum) {
        this.playerNum = playerNum;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNum=" + playerNum +
                '}';
    }
}
