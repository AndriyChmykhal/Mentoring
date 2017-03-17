package com.learning;

/**
 * Created by Andriy_Chmykhal on 3/17/2017.
 */
public class Test {

    public static void main(String[] args) {
        Car car = new Car();
        car.setManufacturer("Toyota");
        car.options = "cabriolet";

        System.out.println(car.getManufacturer());
    }
}