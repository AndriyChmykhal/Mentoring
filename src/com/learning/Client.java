package com.learning;

class Client implements Observer {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void update(String date) {
        System.out.println(name + " received update " + date);
    }

    public Client(String name) {
        this.name = name;
    }

}