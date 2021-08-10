package ru.job4j.oop;

public class Train implements Vehicle {
    @Override
    public void info() {
        System.out.print("Поезд ");
    }

    @Override
    public void move() {
        System.out.println("ездит по рельсам.");
    }
}
