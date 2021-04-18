package com.gdstruct.quiz6;

public class Node {
    private Integer data;
    private Node left;
    private Node right;


    public Node (int newData)
    {
        data = newData;
    }

    public Node ()
    {

    }

    public void insert(int _data) {
        if (data == null)
        {
            this.data = _data;
        }

        if (data == _data) {
            return;
        }

        if (_data < data) {
            if (left == null) {
                left = new Node(_data);
            } else {
                left.insert(_data);
            }
        }

        if (_data > data) {
            if (right == null) {
                right = new Node(_data);
            } else {
                right.insert(_data);
            }
        }
    }

    public void traverse ()
    {
        if (left != null)
        {
            left.traverse();
        }
        System.out.println(data);

        if (right != null){
            right.traverse();
        }
    }

    public void traverseInOrderReversed()
    {
        if (right != null)
        {
            right.traverseInOrderReversed();
        }
        System.out.println(data);

        if (left != null){
            left.traverseInOrderReversed();
        }
    }

    public Node get(int query)
    {
        if (query == data)
        {
            return this;
        }

        if (query < data)
        {
            if (left != null)
            {
                left.get(query);
            }
        }

        if (query > data){
            if (right != null){
                right.get(query);
            }
        }

        return null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                '}';
    }
}
