package ru.job4j.oop;

public class Aircraft implements Vehicle {
    @Override
    public void info() {
        System.out.print("Самолёт ");
    }

    @Override
    public void move() {
        System.out.println("летает по воздуху.");
    }
}
