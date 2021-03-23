package com.gdstruct.quiz3;

public class PlayerQueue {
    private PlayerNode list;

    public PlayerQueue(Player firstPlayer)
    {
        list = new PlayerNode(firstPlayer);
    }

    public  PlayerQueue()
    {
        list = new PlayerNode();
    }

    public void enqueue(Player nPlayer)
    {
        if (list == null)
        {
            list = new PlayerNode();
        }

        PlayerNode current = list;
        PlayerNode lastIteration = null;
        PlayerNode newNode = new PlayerNode(nPlayer);
        while (current != null)
        {
            lastIteration = current;
            current = current.getNext();
        }

        lastIteration.setNext(newNode);
        lastIteration.setPrevious(current);
        newNode.setNext(null);
    }

    public void dequeue()
    {
        if (list == null)
        {
            throw new NullPointerException();
        }

        if (size() > 1) {
            PlayerNode newHead = list.getNext();
            list.setNext(null);
            newHead.setPrevious(null);
            list = newHead;
        }
        else
        {
            list = null;
        }
    }

    public Player peek()
    {
        return list.getPlayer();
    }

    public int size() // i may have copied this from MY previous module
            //work smarter not harder, also copied from MY previous module akin yan mah code
    {
        int count = 0;
        PlayerNode headIteration = list;
        while (headIteration != null)
        {
            count++;
            headIteration = headIteration.getNext();
        }
        return count;
    }

    public void printAll() // bruh i have different methods on two modules LUL am smort
    {
        PlayerNode Iterator = list;
        while (Iterator != null) {
            System.out.println(Iterator.getPlayer());
            Iterator = Iterator.getNext();
        }
    }

}