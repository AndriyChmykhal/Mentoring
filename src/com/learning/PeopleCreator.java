package com.learning;
public class PeopleCreator {
    public static void main(String[] args) {
        createPerson("John", "Snow", "snow@winterfall.net");
        createPerson("Rob", "Stark", "stark@winterfall.net");
    }
    private static void createPerson(String name, String Surname, String email) {
        PersonDescriber personDescriber = new PersonDescriber();
        personDescriber.setName(name);
        personDescriber.setSurname(Surname);
        personDescriber.setEmail(email);
        System.out.println(personDescriber.getName() + " " + personDescriber.getSurname() + " " + personDescriber.getEmail());
    }
}
