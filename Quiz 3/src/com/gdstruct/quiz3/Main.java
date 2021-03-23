package com.gdstruct.quiz3;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// INFRASTRUCTURE
        // main objectives :: enqueue() - adds item at end
        // dequeue :: remove item at front
        // peek :: you know what

        Random rNum = new Random();
        int dummy;
        String input;
        Scanner scanner = new Scanner(System.in);
        int games = 0;
        PlayerQueue queue = new PlayerQueue();

        while (games != 10)
        {

            System.out.println("Players are now queueing.");
            randomBatchEnqueue(queue);

            System.out.println("Press Enter to End Turn");
            input = scanner.nextLine();

            System.out.println("\nCurrent Players in Queue: (" + queue.size() + ")");
            queue.printAll();
            if (queue.size() >= 5)
            {
                System.out.println("\nMinimum Amount of players in queue. (" + queue.size() + ")");
                System.out.println("Would you like to start the game? (1 or 0)");
                dummy = scanner.nextInt();
                if (dummy == 1)
                {
                    System.out.println("Game Started.");
                    dequeueFive(queue);
                    games++;
                }
            }
            System.out.println();
            System.out.println("Games: " + games);
        }
    }

    public static void randomBatchEnqueue(PlayerQueue queue)
    {
        String[] nameList = new String[5];

        nameList[0] = "branli";
        nameList[1] = "Koolie Aid";
        nameList[2] = "flexg";
        nameList[3] = "m86";
        nameList[4] = "cheruhh";

        Random rNum = new Random();
        int x = rNum.nextInt(7) + 1;
        for (int i = 0; i < x; i++)
        {
            queue.enqueue(new Player(nameList[rNum.nextInt(nameList.length)], rNum.nextInt(100) + 1, rNum.nextInt(10)));
        }
    }

    public static void dequeueFive(PlayerQueue queue)
    {
        if (queue.size() >= 5) {
            for (int i = 0; i < 5; i++) {
                queue.dequeue();
            }
        }
        else
        {
            for (int i = 0; i < queue.size(); i++)
            {
                queue.dequeue();
            }
        }
    }
}