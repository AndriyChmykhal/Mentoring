package com.learning;

import java.util.ArrayList;

class TimeServer implements Observable {
    private ArrayList<Observer> observers = new ArrayList<Observer>();
    private String date = new java.util.Date().toString();

    public TimeServer(String date) {
        this.date = date;
    }
    public void setDate(String date) {
        this.date = date;
        System.out.println("TimeServer updates the date to " + date);
        notifyObservers();
    }
    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }
    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this.date);
        }
    }
}
