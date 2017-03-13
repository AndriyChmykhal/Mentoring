package com.learning;

//Additional: Write a program called SumAndAverage to produce the sum of 1, 2, 3, ..., to 100. Also compute and display the average.


public class SumAndAverage {
    public static void main(String[] args){
        double Sum = 0;
        double Average = 0;
        for (int i = 1; i <= 100; i++){
            Sum += i;
            Average = Sum / i;
        }
        System.out.println(Sum);
        System.out.println(Average);
    }
}
