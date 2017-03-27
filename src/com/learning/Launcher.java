package com.learning;

/**
 * Created by Andriy_Chmykhal on 3/27/2017.
 */
public class Launcher {

    public static void main(String args[]) throws InterruptedException {
        Client client1 = new Client("Client1");
        Client client2 = new Client("Client2");

        TimeServer currenttime = new TimeServer(new java.util.Date().toString());
        currenttime.registerObserver(client1);
        currenttime.registerObserver(client2);

        currenttime.setdate(new java.util.Date().toString());
        Thread.sleep(2000);
        currenttime.setdate(new java.util.Date().toString());
    }
}
