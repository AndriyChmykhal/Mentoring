package com.learning;

//Find if number belongs to the array using binary search algorithm (Hint: use bubble sort from previous task)

public class BinarySearcher {
    public static void main(String[] args) {
        int[] inputArr = new int[]{10, 1, 8, 2, -1, 14, 10, 3, 4, 0};


        int[] sortedArray = BubbleSorter.sort(inputArr);
        int x = 1;
        boolean result = false;

        int start = 0;
        int finish = sortedArray.length - 1;
        while (start <= finish && !result) {
            int middle = (start + finish) / 2;
            if (x == sortedArray[middle]) {
                result = true;
            } else if (x > sortedArray[middle]) {
                start = (middle + 1);
            } else if (x < sortedArray[middle]) {
                finish = (middle - 1);
            } else {
                break;
            }
        }
        System.out.print(result);

    }
}