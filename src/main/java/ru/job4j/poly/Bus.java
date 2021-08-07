package ru.job4j.poly;

public class Bus implements Transport {
    @Override
    public void drive() {
        System.out.println("Автобус поехал.");
    }

    @Override
    public void passengers(int pass) {
        System.out.println("В автобус зашло " + pass + " пассажиров.");
    }

    @Override
    public int refuel(int liters) {
        int price = 45;
        return price * liters;
    }
}
