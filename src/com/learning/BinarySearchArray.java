package com.learning;

//Find if number belongs to the array using binary search algorithm (Hint: use bubble sort from previous task)

public class BinarySearchArray {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 1;
        boolean result = false;

        int start = 0;
        int finish = arr.length - 1;
        while (start <= finish && !result) {
            int middle = (start + finish) / 2;
            if (x == arr[middle]) {
                result = true;
            } else if (x > arr[middle]) {
                start = (middle + 1);
            } else if (x < arr[middle]) {
                finish = (middle - 1);
            } else {
                break;
            }
        }
        System.out.print(result);

    }
}
