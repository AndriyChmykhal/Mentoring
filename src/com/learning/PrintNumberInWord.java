package com.learning;


//Additional: Write a program called PrintNumberInWord which prints "ONE", "TWO",... , "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.


public class PrintNumberInWord {
    public static void main (String[] args){

        int day = 3;
        String dayString;

        switch (day) {
            case 1:
                dayString = "One";
                break;
            case 2:
                dayString = "Two";
                break;
            case 3:
                dayString = "Three";
                break;
            case 4:
                dayString = "Four";
                break;
            case 5:
                dayString = "Five";
                break;
            case 6:
                dayString = "Six";
                break;
            case 7:
                dayString = "Seven";
                break;
            case 8:
                dayString = "Eight";
                break;
            case 9:
                dayString = "Nine";
                break;
            default:
                dayString = "Number is out of scope of the program";
            }
            System.out.println(dayString);
    }
}
