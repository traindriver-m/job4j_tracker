package ru.job4j.inheritance;

public class Programmer extends Engineer {
    private String language;

    public Programmer(String name, String surname, String education,
                      String birthday, int experience, String language) {
        super(name, surname, education, birthday, experience);
        this.language = language;
    }

    public Programm develope(Plan plan) {
return new Programm();
    }

}
