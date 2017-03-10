package com.learning;

import java.util.Arrays;

public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {10, 1, 3, 5, 4, 7, 6, 9, 8, 2};
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1 -i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }

            }
            System.out.println(Arrays.toString(arr));
        }
        System.out.println(Arrays.toString(arr));
    }
}
