package com.learning;
import java.util.Arrays;
//By using the bubble sort algorithm, write a Java program to sort an integer array of 10 elements in ascending.
public class BubbleSorter {
    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        return arr;
    }
}
