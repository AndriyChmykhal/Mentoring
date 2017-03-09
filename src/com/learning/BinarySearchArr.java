package com.learning;

//Find if number belongs to the array using binary search algorithm (Hint: use bubble sort from previous task)

public class BinarySearchArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int x = 4;
        boolean result;

        int first = 0;
        int last = arr.length - 1;
        while (first <= last) {
            int middle = (last + first) / 2;
            if (x == arr[middle]) {
                result = true;
            } else if
                    (x > arr[middle]) {
                first = (middle + 1);
                result = false;
            } else if
                    (x < arr[middle]) {
                last = (middle - 1);
                result = false;
            }

            System.out.print(result);
        }

    }
}
