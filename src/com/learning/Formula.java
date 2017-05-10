package com.learning;

public class Formula {

    public String calculate(double a, double b, double c) {
        try {
            if (a == 0)
                throw new Exception("Parameter 'a' cannot be equal to zero for such formula. Please, change it for another value");
            double x1, x2;
            double D = (b * b - 4 * a * c);
            x1 = (-b - Math.sqrt(D)) / (2 * a);
            x2 = (-b + Math.sqrt(D)) / (2 * a);
            if (D < 0) {
                throw new Exception("For such parameters discriminant value is negative. In this case there are no roots");
            }
            if (D == 0) {
                return ("x1 = " + x1);
            } else {
                return ("x1 = " + x1 + "x2 = " + x2);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}



