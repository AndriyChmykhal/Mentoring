package com.learning;


public class Car {
    private String manufacturer;
    private String model;
    private String year;
    public String options;
    private static int quantity;

    public Car() {
        quantity++;
    }

    public Car(final String manufacturer, final String model) {
        this();
        this.manufacturer = manufacturer;
        this.model = model;
    }

    public Car(final String manufacturer, final String model, final String year, final String options) {
        this(manufacturer, model);
        this.year = year;
        this.options = options;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(final String model) {
        this.model = model;
    }

    public String getYear() {
        return year;
    }

    public void setYear(final String year) {
        this.year = year;
    }
}

