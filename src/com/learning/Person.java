package com.learning;

/**
 * Created by Andriy_Chmykhal on 3/17/2017.
 */
public class Person {
    String name;
    String surname;
    String email;

    public Person(String name, String surname, String email) {
        this.name = name;
        this.surname = surname;
        this.email = email;
    }
    Person person = new Person("John", "Snow", "john_snow@gmail.com");

    public void setName(String name) {
        this.name = name;
    }
}
