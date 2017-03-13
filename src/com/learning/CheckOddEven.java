package com.learning;
//Additional: Write a program called CheckOddEven which prints "Odd Number" if the int variable “number” is odd, or “Even Number” otherwise.
public class CheckOddEven {
    public static void main(String[] args) {
        int x = -2;
        if (x % 2 == 0) {
            System.out.println("Odd Number");
        } else {
            System.out.println("Even Number");
        }
    }
}

