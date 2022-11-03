package com.gdstruc.module4;
import java.util.Objects;

public class Player {
    private int playerNum;

    public Player(int playerNum) {
        this.playerNum = playerNum;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playerNum=" + playerNum +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Player player = (Player) o;
        return playerNum == player.playerNum;
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerNum);
    }
}

