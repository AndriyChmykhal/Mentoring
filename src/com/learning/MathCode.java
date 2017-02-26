package com.learning;

public class MathCode {

    public static void main(String[] args) {

        double a = 1.00;
        double b = 2.00;
        double c = 3.00;
        double x1,x2,x;

        double D = (b*b-4*a*c);

        x = -(b/(2*a));
        x1 = (-b - Math.sqrt(D))/(2*a);
        x2 = (-b + Math.sqrt(D))/(2*a);


        if (a == 0) {
            System.out.println("Parameter 'a' cannot be equal to zero for such formula. Please, change it for another value");
        } else

        if (D < 0) {
            System.out.println("For such parameters discriminant value is negative. In this case there are no roots");
        } else


        if (D == 0) {
            if (b != 0) {
                System.out.println("For such parameters discriminant value equals to zero. In this case there is only one root x = " + x);
            } else {
                System.out.println("For such parameters discriminant value equals to zero. In this case x has only one root x = " + (-x));

            }
        }

        if (D > 0) {
            System.out.println("The first root of formula x1 = " + x1);
            System.out.println("The second root of formula x2 = " + x2);
        }


    }

}
