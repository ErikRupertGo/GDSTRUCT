package com.gdstruct.quiz4;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Player kool = new Player("Koolie Aid", 69,1);
        Player test = new Player("test", 32, 2);
        Player pogr = new Player("Pogr", 16, 3);
        HashTable table = new HashTable();

        table.put(kool.getuName(), kool);
        table.put(test.getuName(), test);
        table.put(pogr.getuName(), pogr);
        table.printTable();

        System.out.println(table.get(pogr.getuName()));

        table.remove(test.getuName());
        table.printTable();
    }
}
