package ru.job4j.oop;

public class Wolf {
    private String name = "волк";

    public void tryEat(Ball ball) {
        System.out.println("Колобок - колобок, я тебя съем!");
    }

    public String getName() {
        return this.name;
    }
}
