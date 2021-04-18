package com.gdstruct.quiz6;

public class Tree {
    private Node root;

    public Tree()
    {
        root = new Node();
    }

    public void insert (int value){

        if (root == null){
            root = new Node(value);
        }
        else {
            root.insert(value);
        }
    }

    public void traverseInOrder()
    {
        if (root != null)
        {
            root.traverse();
        }
    }

    public void traverseInOrderDescending()
    {
        if (root != null)
        {
            root.traverseInOrderReversed();
        }
    }

    public Node get(int query){
        if (root != null){
            return root.get(query);
        }
        return null;
    }

    public int getMin()
    {
        Node iterator = root; //having an invisible variable that stores a temp data
        while (iterator.getLeft() != null)  //iterates and checks
        {
            iterator = iterator.getLeft();
        }
        return iterator.getData(); //ends loops if null then get the latest data inscribed
    }

    public int getMax()
    {
        Node iterator = root;
        while (iterator.getRight() != null)
        {
            iterator = iterator.getRight();
        }
        return iterator.getData();
    }

}
