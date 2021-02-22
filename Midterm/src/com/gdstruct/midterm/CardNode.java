package com.gdstruct.midterm;

import java.util.Objects;

public class CardNode {
    private Card card;
    private CardNode next;
    private CardNode previous;

    CardNode(Card nCard)
    {
        card = nCard;
    }
    public Card getCard() {
        return card;
    }

    public void setCard(Card card) {
        this.card = card;
    }

    public CardNode getNext() {
        return next;
    }

    public void setNext(CardNode next) {
        this.next = next;
    }

    public CardNode getPrevious() {
        return previous;
    }

    public void setPrevious(CardNode previous) {
        this.previous = previous;
    }

    @Override
    public String toString() {
        return "Card{" + card +
                '}';
    }
}
