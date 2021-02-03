package com.gdstruct.mod3;

import java.util.Objects;

public class PlayerClass {
    private int playerId;
    private String playerName;
    private int level;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlayerClass that = (PlayerClass) o;
        return playerId == that.playerId && level == that.level && Objects.equals(playerName, that.playerName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(playerId, playerName, level);
    }

    @Override
    public String toString() {
        return "PlayerClass{" +
                "playerId=" + playerId +
                ", playerName='" + playerName + '\'' +
                ", level=" + level +
                '}';
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    
}
