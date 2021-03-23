package com.gdstruct.quiz3;

public class PlayerNode {
    private Player player;
    public PlayerNode next;
    public PlayerNode previous;

    public PlayerNode(Player player) {
        this.player = player;
    }

    public PlayerNode()
    {
        player = new Player();
    }

    public Player getPlayer() {
        return player;
    }

    public void setPlayer(Player player) {
        this.player = player;
    }

    public PlayerNode getNext() {
        return next;
    }

    public void setNext(PlayerNode next) {
        this.next = next;
    }

    public PlayerNode getPrevious() {
        return previous;
    }

    public void setPrevious(PlayerNode previous) {
        this.previous = previous;
    }
}