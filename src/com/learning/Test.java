package com.learning;

/**
 * Created by Andriy_Chmykhal on 3/17/2017.
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer("bugatti");
        car.setYear("2017");
        System.out.println(car.getManufacturer());

        Car car1 = new Car("VW", "Golf", "2016", "GTR");
        System.out.println(car1.getYear());
    }
}