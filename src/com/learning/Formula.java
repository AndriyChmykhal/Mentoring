package com.learning;

public class Formula {

    public String calculate(double a, double b, double c) {


        try {
            if (a == 0)
                throw new Exception("Parameter 'a' cannot be equal to zero for such formula. Please, change it for another value");
            double x1, x2, x;
            double D = (b * b - 4 * a * c);
            x = -(b / (2 * a));
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            if (D < 0) {
                throw new Exception("For such parameters discriminant value is negative. In this case there are no roots");
            }
            if (D == 0) {
                if (b != 0) {
                    return ("For such parameters discriminant value equals to zero. Roots equals to = " x + " " + (-x);
                } else {
                    return ("For such parameters discriminant value equals to zero. In this case x has only one root x = " + (-x));
                }
            } if (D > 0) {
                return ("The first root of formula x1 = " + x1 + "The second root of formula x2 = " + x2);

            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}



