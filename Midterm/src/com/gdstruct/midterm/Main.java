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
        CardStack playerDeck = new CardStack();
        playerDeck.populateDeck(30);

        while (playerDeck.size() != 0)
        {
            rNum = random.nextInt(3);
            if (rNum == 0)
            {
                playerDeck.populateDeck(random.nextInt(5) + 1); // its still random lol
                System.out.println("Drawing cards...");
            }
            else if (rNum == 1)
            {
                transfer(random.nextInt(5) + 1, playerDeck, discarded);
                System.out.println("Discarding Cards...");
            }
            else
            {
                rNum = random.nextInt(5) + 1;
                if (rNum > discarded.size())
                {
                    transfer(discarded.size(), discarded, playerDeck);
                }
                else if (discarded.size() == 0)
                {
                    System.out.println("Discarded pile empty");
                }
                else {
                    transfer(rNum, discarded, playerDeck);
                }

                System.out.println("Transferring Discarded to Hand");
            }

            System.out.println();
            //After round

            //List of cards that the player is currently holding
            System.out.println("List of Cards left in hand:");
            playerDeck.printAll();
            System.out.println();

            //Number of remaining cards in the player deck
            System.out.println("Number of cards left in hand:");
            System.out.println(playerDeck.size());

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
