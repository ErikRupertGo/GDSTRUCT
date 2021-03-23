package com.gdstruct.quiz3;
public class Player {
    private String name;
    private int level;
    private int playerID;

    public Player(String name, int level, int playerID) {
        this.name = name;
        this.level = level;
        this.playerID = playerID;
    }

    public Player()
    {
        this.name = "Koolie Aid";
        this.level = 180;
        this.playerID = 5;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getPlayerID() {
        return playerID;
    }

    public void setPlayerID(int playerID) {
        this.playerID = playerID;
    }

    @Override
    public String toString() {
        return "Player{" +
                "name='" + name + '\'' +
                ", level=" + level +
                ", playerID=" + playerID +
                '}';
    }
}