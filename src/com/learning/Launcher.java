package com.learning;

import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Launcher {
    public static void main(String[] args) {
        getCurrentDate();
    }

    private static void getCurrentDate() {
        DateFormat df = new SimpleDateFormat("dd/MM/yy HH:mm:ss");
        Date currentDate = new Date();
        System.out.println(df.format(currentDate));
    }
}
