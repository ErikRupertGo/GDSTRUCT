package com.gdstruct.quiz2;

public class Main {

    public static void main(String[] args) {
	// write your code here
        LinkedList mahList = new LinkedList(10);
        mahList.addNode(20);
        mahList.addNode(30);
        mahList.addNode(40);
        mahList.addNode(50);
        System.out.println(mahList.size());

        System.out.println(mahList.contains(new Node(20)));
        System.out.println(mahList.indexOf(new Node(20)));

        System.out.println();
        mahList.printAll();
        mahList.removeAtIndex(1);
        System.out.println();
        mahList.printAll();

    }
}
