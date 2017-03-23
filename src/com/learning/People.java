package com.learning;
public class People {
    public static void main(String[] args) {
        createPerson("John", "Snow", "snow@winterfall.net");
        createPerson("Rob", "Stark", "stark@winterfall.net");
    }
    private static void createPerson(String name, String surname, String email) {
        Person person = new Person();
        person.setName(name);
        person.setSurname(surname);
        person.setEmail(email);
        System.out.println(person.getName() + " " + person.getSurname() + " " + person.getEmail());
    }
}
