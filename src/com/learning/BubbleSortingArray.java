

package com.learning;
import java.util.Arrays;

 public class BubbleSortingArray {
    public static void main(String[] args) {
        int[] arr = new int[]{10, 1, 8, 2, -1, 14, 10, 3, 4, 0};
        for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] > arr[j + 1]) {
                        int temp = arr[j];
                        arr[j] = arr[j + 1];
                        arr[j + 1] = temp;

                    }

            }

       }
        System.out.println(Arrays.toString(arr));




    }
}
