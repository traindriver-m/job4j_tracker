package ru.job4j.inheritance;

public class Dentist extends Doctor {
    private String specialization;

    public Dentist(String name, String surname, String education, String birthday, int experience,
                   String specialization) {
        super(name, surname, education, birthday, experience);
        this.specialization = specialization;
    }

    public void treatTooth(Pacient pacient) {

    }
}
