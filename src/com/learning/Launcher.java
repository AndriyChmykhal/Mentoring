package com.learning;

public class Launcher {
    public static void main(String args[]) throws InterruptedException {
        Client client1 = new Client("Client1");
        Client client2 = new Client("Client2");
        TimeServer currentTime = new TimeServer(new java.util.Date().toString());
        currentTime.registerObserver(client1);
        currentTime.registerObserver(client2);
        currentTime.setDate(new java.util.Date().toString());
        Thread.sleep(2000);
        currentTime.setDate(new java.util.Date().toString());
    }
}
