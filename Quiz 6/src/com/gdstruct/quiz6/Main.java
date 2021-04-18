package com.gdstruct.quiz6;

public class Main {

    public static void main(String[] args) {
        Tree treeOfLife = new Tree();
        treeOfLife.insert(3);
        treeOfLife.insert(2);
        treeOfLife.insert(9);
        treeOfLife.insert(46);

        treeOfLife.traverseInOrderDescending();

        System.out.println(treeOfLife.get(3));
        System.out.println(treeOfLife.getMin());
        System.out.println(treeOfLife.getMax());
    }
}
