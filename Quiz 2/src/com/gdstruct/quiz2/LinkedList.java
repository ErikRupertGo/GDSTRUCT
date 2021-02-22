package com.gdstruct.quiz2;

public class LinkedList {

    private Node head;
    private int size = 1; //sabi raw size variable pero gumawa ako ng size() funciton lol

    public LinkedList(int data)
    {
        head = new Node(data);
    }

    public Node getHead() {
        return head;
    }

    public int getSize() {
        return size;
    }

    public void removeFirstElement()
    {
        head = head.getNextNode();
        head.setPrevNode(null);
        size--;
    }

    public void addNode(int data)
    {
        Node current = head;
        Node lastIteration = null;
        Node newNode = new Node(data);
        while (current != null)
        {
            lastIteration = current;
            current = current.getNextNode();
        }

        lastIteration.setNextNode(newNode);
        lastIteration.setPrevNode(current);
        newNode.setNextNode(null);

        size++;
    }

    public void removeAtIndex(int index)
    {
        Node headIteration = head;
        Node previousNode = headIteration;
        for (int i = 0; i < index; i++)
        {
            previousNode = headIteration;
            headIteration = headIteration.getNextNode();
        }
        previousNode.setNextNode(headIteration.getNextNode());
        headIteration.getNextNode().setPrevNode(previousNode);
    }

    public int size()
    {
        int count = 0;
        Node headIteration = head;
        while (headIteration != null)
        {
            count++;
            headIteration = headIteration.getNextNode();
        }
        return count;
    }

    public boolean contains(Node search)
    {
        Node headIteration = head;
        while (headIteration != null)
        {
            if (headIteration.getValue() == search.getValue())
            {
                return true;
            }
            headIteration = headIteration.getNextNode();
        }
        return false;
    }

    public int indexOf(Node search)
    {
        Node headIteration = head;
        for (int i = 0; i < this.size(); i++)
        {
            if (headIteration.getValue() == search.getValue())
            {
                return i;
            }
            headIteration = headIteration.getNextNode();
        }
        return -1;
    }

    public void printAll()
    {
        Node headIte = head;
        for (int i = 0; i < this.size(); i++)
        {
            System.out.println(headIte.getValue());
            headIte = headIte.getNextNode();
        }
    }
}
