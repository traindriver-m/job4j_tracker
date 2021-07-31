package ru.job4j.inheritance;

import ru.job4j.inheritance.Doctor;
import ru.job4j.inheritance.Pacient;

public class Surgeon extends Doctor {
    private int category;

    public Surgeon(String name, String surname, String education, String birthday, int experience, int category) {
        super(name, surname, education, birthday, experience);
        this.category = category;
    }

    public void performOperation(Pacient pacient) {

    }
}
