package com.gdstruct.quiz1;

public class Main {

    public static void main(String[] args) {

        int[] nums = new int [10];

        nums[0] = 4;
        nums[1] = 2;
        nums[2] = 25;
        nums[3] = 21;
        nums[4] = 52;
        nums[5] = 27;
        nums[6] = 34;
        nums[7] = 10;
        nums[8] = 5;
        nums[9] = 7;

        System.out.println("Before Sorting:");
        printNum(nums);

        selecSort(nums);

        System.out.println("\nAfter Sorting:");
        printNum(nums);
    }
    private static void bubSort(int[] numbers)
    {
        for (int ordered = 0; ordered < numbers.length; ordered++)
        {
            for (int i = numbers.length - 1; i > ordered; i--)
            {
                if (numbers[i] > numbers[i - 1])
                {
                    int temp = numbers[i];
                    numbers[i] = numbers[i - 1];
                    numbers[i - 1] = temp;
                }
            }
        }
    }

    private static void selecSort(int[] numbers)
    {
        for (int ordered = numbers.length - 1; ordered > 0; ordered--)
        {
            int smallestIndex = 0;
            for (int i = ordered; i > 0; i--)
            {
                if (numbers[i] < numbers[smallestIndex])
                {
                    smallestIndex = i;
                }
            }

            int temp = numbers[ordered];
            numbers[ordered] = numbers[smallestIndex];
            numbers[smallestIndex] = temp;
        }
    }

    private static void printNum(int[] num)
    {
        for (int i : num)
        {
            System.out.print(i + "\t");
        }
        System.out.println();
    }
}
