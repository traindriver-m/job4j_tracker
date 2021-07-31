package ru.job4j.pojo;

import java.time.format.DateTimeFormatter;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setFio("Иванов Арсений Дармоедович");
        student.setGroup("ЭВМ 24");
        student.setAdmission(new Date());
        System.out.println(student.getFio() + System.lineSeparator() + student.getGroup()
        + System.lineSeparator() + student.getAdmission());
    }
}
