package com.epam;

public class MathCode {

    public static void main(String[] args) {

        double a = 1.00;
        double b = 10.00;
        double c = 1.00;
        double x1,x2;

        x1 = (-b - Math.sqrt(b*b-4*a*c))/(2*a);
        x2 = (-b + Math.sqrt(b*b-4*a*c))/(2*a);

        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }

}
