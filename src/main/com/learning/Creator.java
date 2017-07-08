package com.learning;

import org.slf4j.LoggerFactory;
import java.io.IOException;
import java.util.Scanner;
import org.slf4j.Logger;

public class Creator {

    public static void main(String[] args) throws IOException {

        Logger log = LoggerFactory.getLogger(Creator.class);

        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number of profiles you want to create: ");
        int x=sc.nextInt();

        Person[] people = new Person[x];

        for(int i=0; i<x; i++){
            log.trace("Profile #{} was created",i+1);
            people[i] = new Person();
            System.out.println("Enter name: ");
            people[i].setName(sc.next());
            System.out.println("Enter surname: ");
            people[i].setSurname(sc.next());
            System.out.println("Enter email: ");
            people[i].setEmail(sc.next());
            System.out.println("Enter the number of children: ");
            people[i].setChildren(sc.nextInt());
            System.out.println("Enter gender (MALE, FEMALE, OTHER): ");
            people[i].setGender(sc.next());
            System.out.println("Enter pet (Dog, Cat, Fish, Parrot, Hamster, Other, None): ");
            people[i].setPet(sc.next());
        }

        sc.close();

        System.out.println("You've created "+x+" profile(s).");
        System.out.println();

        for(int i=0; i<x; i++){
            System.out.println("Profile #"+(i+1));
            people[i].printPerson();
        }

        PeopleStatistics.trioStatistics(people);
        PeopleStatistics.childrenStatistics(people,2);
        PeopleStatistics.petStatistics(people, Pet.Dog);
    }
}
