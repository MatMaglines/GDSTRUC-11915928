package com.gdstruc.module1;

public class Main {

    public static void main(String[] args)
    {
	    int[] numbers = new int [10];

        numbers[0] = 23;
        numbers[1] = 88;
        numbers[2] = 73;
        numbers[3] = 98;
        numbers[4] = 124;
        numbers[5] = 55;
        numbers[6] = 63;
        numbers[7] = 13;
        numbers[8] = 26;
        numbers[9] = 91;

        System.out.println("Before chosen sort:");
        printArrayElements(numbers);

        ModifiedSelectionSort(numbers);  // To check the sorting method

        System.out.println("\n\nAfter chosen sort:");
        printArrayElements(numbers);

    }

    private static void BubbleSortDesc(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1;lastSortedIndex > 0; lastSortedIndex --)
        {
            for (int i = 0; i < lastSortedIndex; i++)
            {
                if (arr[i] < arr[i + 1])
                {
                    int temp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = temp;
                }
            }
        }
    }

    private static void SelectionSortDesc(int[] arr)
    {
        for (int lastSortedIndex = arr.length - 1; lastSortedIndex > 0; lastSortedIndex --)
        {
            int LargestIndex = 0;

            for (int i = 1; i <= lastSortedIndex; i++)
            {
                if (arr[i] < arr[LargestIndex])
                {
                    LargestIndex = i;
                }
            }
            int temp = arr[lastSortedIndex];
            arr[lastSortedIndex] = arr[LargestIndex];
            arr[LargestIndex] = temp;

        }
    }

    private static void ModifiedSelectionSort(int[] arr)
    {
        for (int LastIndex = arr.length - 1; LastIndex > 0; LastIndex --)
        {
            int SmallestIndex = 0;

            for (int i = 1; i <= LastIndex; i++)
            {
                if (arr[i] < arr[SmallestIndex])
                {
                    SmallestIndex = i;
                }
            }
            int temp = arr[LastIndex];
            arr[LastIndex] = arr[SmallestIndex];
            arr[SmallestIndex] = temp;

        }
    }

    private static void printArrayElements (int [] arr)
    {
        for (int j : arr)
        {
            System.out.print(j + " ");
        }
    }
}
