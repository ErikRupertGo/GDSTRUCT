package com.gdstruct.quiz4;

public class StoredPlayer {
    public String key;
    public Player value;

    public StoredPlayer(String key, Player value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "StoredPlayer{"
                + value +
                '}';
    }
}
