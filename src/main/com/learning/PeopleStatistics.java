package com.learning;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PeopleStatistics {

    // This method analyzes how many vocal trios we can make.
    public static void trioStatistics (Person[] n){
        int trios = n.length/3;
        System.out.println("We cam make "+trios+" trios.");
        log.info("We cam make {} trios.", trios);
    }
    //This method analyzes how many people have certain amount of children.
    public static void childrenStatistics (Person[] n, int x){
        int z = 0;
        for(int i = 0;i<n.length;i++){
            if (n[i].children == x){
                z++;
            }
        }
        System.out.println(z + " people have " + x + " children.");
        log.info("{} people have {} children.", z, x);
    }
    //This method analyzes how many people have certain type of pet.
    public static void petStatistics (Person[] n, Pet x){
        int z=0;
        for(int i = 0;i<n.length;i++){
            if (n[i].pet == x){
                z++;
            }
        }
        System.out.println(z + " people have " + x + " as a pet.");
        log.info("{} people have {} as a pet.", z, x);
    }
}