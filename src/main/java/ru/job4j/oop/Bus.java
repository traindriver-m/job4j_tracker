package ru.job4j.oop;

public class Bus implements Vehicle {
    @Override
    public void info() {
        System.out.print("Автобус ");
    }

    @Override
    public void move() {
        System.out.println("ездит по дорогам.");
    }
}
