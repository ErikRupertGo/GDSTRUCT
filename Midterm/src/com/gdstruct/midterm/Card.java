package com.gdstruct.midterm;

import java.util.Objects;

public class Card {

    private String name;
    private int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getValue() {
        return value;
    }

    public void setVal(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return "Name='" + name + '\'' + ", Value=" + value + '}';
    }
}
