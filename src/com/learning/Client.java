package com.learning;

public class Client implements Observer{
    private String name;
    @Override
    public void update(String date) {
        System.out.println(name + " received update " + date);
    }
    public Client(String name) {
        this.name = name;
    }
}
