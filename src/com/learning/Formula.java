package com.learning;

public class Formula {

    public double calculatex1(double a, double b, double c) {
        Double x1 = null;
        try {
            if (a == 0)
                throw new Exception("Parameter 'a' cannot be equal to zero for such formula. Please, change it for another value");
            double D = (b * b - 4 * a * c);
            if (D < 0) {
                throw new Exception("For such parameters discriminant value is negative. In this case there are no roots");
            }
            else {
                x1 = (-b - Math.sqrt(D)) / (2 * a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x1;
    }
    public double calculatex2(double a, double b, double c) {
        Double x2 = null;
        try {
            if (a == 0)
                throw new Exception("Parameter 'a' cannot be equal to zero for such formula. Please, change it for another value");

            double D = (b * b - 4 * a * c);

            if (D < 0) {
                throw new Exception("For such parameters discriminant value is negative. In this case there are no roots");
            }
            else {
                x2 = (-b + Math.sqrt(D)) / (2 * a);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return x2;
    }
}



