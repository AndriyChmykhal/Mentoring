package com.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class HelloWorld {

    public static void main(String args[]){
        Logger LOG = LoggerFactory.getLogger(HelloWorld.class);
        System.out.println("Hello World!");
        LOG.info("Hello World!");

    }
}
