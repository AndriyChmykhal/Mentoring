package com.learning;

 public class BubbleSorting {
    public static void main(String[] args) {
        int arr[] = {10, 1, 3, 5, 4, 7, 6, 9, 8, 2};
             for (int i = 0; i < arr.length; i--) {
                for (int j = 1; j < arr.length-i; j++) {
                    if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
       }System.out.print(arr);



    }
}
