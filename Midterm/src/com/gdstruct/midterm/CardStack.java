package com.gdstruct.midterm;

import java.util.EmptyStackException;
import java.util.Random;
import java.util.Scanner;

public class CardStack {

    private CardNode stack;

    private final String[] nameList;

    CardStack(Card card)
    {
        stack = new CardNode(card);

        nameList = new String[4];
        nameList[0] = "Black Clover";
        nameList[1] = "Black Shade";
        nameList[2] = "Red Heart";
        nameList[3] = "Red Diamond";
    }

    CardStack()
    {
        nameList = new String[4];
        nameList[0] = "Black Clover";
        nameList[1] = "Black Shade";
        nameList[2] = "Red Heart";
        nameList[3] = "Red Diamond";
    }

    public int size() // i may have copied this from MY previous module
    {
        int count = 0;
        CardNode headIteration = stack;
        while (headIteration != null)
        {
            count++;
            headIteration = headIteration.getNext();
        }
        return count;
    }

    public void push(Card card)
    {
        if (stack == null)
        {
            stack = new CardNode(card);
        }
        else {
            CardNode newHead = new CardNode(card);
            newHead.setNext(stack);
            stack.setPrevious(newHead);

            stack = newHead;
        }
    }

    public Card peek()
    {
        return stack.getCard();
    }

    public void pop()
    {
        if (stack == null)
        {
            throw new EmptyStackException();
        }

        if (size() > 1) {
            CardNode newHead = stack.getNext();
            stack.setNext(null);
            newHead.setPrevious(null);
            stack = newHead;
        }
        else
        {
            stack = null;
        }
    }

    public void printAll()
    {
        CardNode sIteration = stack;
        while (sIteration != null) {
            System.out.println(sIteration);
            sIteration = sIteration.getNext();
        }
    }

    public void removeEndCard()
    {
        CardNode current = stack;
        CardNode previous = current;

        while (current.getNext() != null)
        {
            previous = current;
            current = current.getNext();
        }

        current.setPrevious(null);
        previous.setNext(null);
    }

    public void populateDeck(int value)
    {
        Random rNumber = new Random();

        for (int i = 0; i < value; i++)
        {
            this.push(new Card(nameList[rNumber.nextInt(nameList.length)], rNumber.nextInt(9) + 1));
        }
    }

    public void editCard(int index)
    {
        Scanner scanner = new Scanner(System.in);
        CardNode cur = stack;

        for (int i = 0; i < index; i++)
        {
            cur = cur.getNext();
        }

        System.out.println("Editing Name...");
        String input = scanner.nextLine();

        cur.getCard().setName(input);
    }
}
