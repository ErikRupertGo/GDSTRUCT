package com.gdstruct.quiz4;

import java.util.Objects;

public class Player {
    private String uName;
    private int level;
    private int id;

    public Player(String uName, int level, int id) {
        this.uName = uName;
        this.level = level;
        this.id = id;
    }

    public String getuName() {
        return uName;
    }

    public void setuName(String uName) {
        this.uName = uName;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Player{" +
                "User Name='" + uName + '\'' +
                ", level=" + level +
                ", id=" + id +
                '}';
    }
}
