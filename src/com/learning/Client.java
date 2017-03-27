package com.learning;

public class Client implements Observer{
    private String name;

    public void update(String date) {
        System.out.println(name + " received date/time update " + date);
    }
    public Client(String name) {
        this.name = name;
    }
}
