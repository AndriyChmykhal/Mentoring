package com.learning;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Person {

    final Logger warnLog = LoggerFactory.getLogger("warnLogger");

    public String name;
    public String surname;
    public String email;
    public int children;
    Gender gender;
    Pet pet;
    public Person() {
        name="N/A";
        surname="N/A";
        email="N/A";
        children = 0;
        gender = Gender.OTHER;
        pet=Pet.None;
    }


    public void setName(String n) {
        name = n;
    }
    public void setSurname(String s) {
        surname = s;
    }
    public void setEmail(String e) {
        if (e.matches("([\\w\\-\\.]+)@(?:[\\w]+\\.+)([a-zA-Z]{2,4})")){
            email = e;
        } else {
            warnLog.warn("Invalid email was entered.");
        }
    }
    public void setChildren(int c) {

        if(c >= 0){
            children = c;
        } else {
            warnLog.warn("Invalid number was entered.");
        }
    }
    public void setGender(String gender) throws IllegalArgumentException {
        try{
            this.gender = Gender.valueOf(gender);
        } catch (IllegalArgumentException arge){
            warnLog.warn("Invalid gender input.");
            this.gender = Gender.NA;
        }
    }
    public void setPet(String pet) throws IllegalArgumentException {
        try{
            this.pet = Pet.valueOf(pet);
        } catch(IllegalArgumentException arge){
            warnLog.warn("Invalid pet input.");
            this.pet = Pet.NA;
        }
    }

    public void printPerson() {
        System.out.println("Name: "+name);
        System.out.println("Surname: "+surname);
        System.out.println("Email: "+email);
        System.out.println("Children: "+children);
        System.out.println("Gender: "+gender);
        System.out.println("Pet: "+pet);
        System.out.println();
    }

}
