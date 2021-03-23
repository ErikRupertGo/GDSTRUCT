package com.gdstruct.midterm;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        String input;
        int rNum;
        CardStack discarded = new CardStack();
        CardStack hand = new CardStack();
        CardStack table = new CardStack();
        table.populateDeck(30);

        while (table.size() != 0)
        {
            rNum = random.nextInt(3);
            if (rNum == 0)
            {
                System.out.println("Drawing cards...");
                rNum = random.nextInt(5) + 1;
                if (rNum > table.size()) {
                    transfer(table.size(), table, hand);
                }
                else
                {
                    transfer(random.nextInt(5) + 1, table, hand);
                }
            }
            else if (rNum == 1)
            {
                rNum = random.nextInt(5) + 1;
                System.out.println("Discarding Cards...");
                if (hand.size() < rNum) {
                    transfer(hand.size(), hand, discarded);
                }
                else if (hand.size() == 0)
                {
                    System.out.println("Hand is empty");
                }
                else
                {
                    transfer(rNum, hand, discarded);
                }
            }
            else
            {
                System.out.println("Transferring Discarded to Hand");
                rNum = random.nextInt(5) + 1;
                if (rNum > discarded.size())
                {
                    transfer(discarded.size(), discarded, hand);
                }
                else if (discarded.size() == 0)
                {
                    System.out.println("Discarded pile empty");
                }
                else {
                    transfer(rNum, discarded, hand);
                }

            }

            System.out.println();
            //After round

            //List of cards that the player is currently holding
            System.out.println("List of Cards left in hand: (" + hand.size() + " cards)");
            hand.printAll();
            System.out.println();

            //Number of remaining cards in the player deck
            System.out.println("Number of cards left in the table deck:");
            System.out.println(table.size());

            //Number of cards in the discarded pile
            System.out.println("Number of cards in discarded pile");
            System.out.println(discarded.size());

            System.out.println();
            System.out.println("Press Enter to Continue");
            input = scanner.nextLine();// for system pause replication
        }
    }

    public static void transfer(int x, CardStack fromDeck, CardStack toDeck)
    {
        for(int i = 0; i < x; i++)
        {
            toDeck.push(fromDeck.peek());
            fromDeck.pop();
        }
    }
}