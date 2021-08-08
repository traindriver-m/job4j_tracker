package ru.job4j.oop;

public class Transport {
    public static void main(String[] args) {
        Vehicle aircraft = new Aircraft();
        Vehicle train = new Train();
        Vehicle bus = new Bus();
        Vehicle eurotrain = new Train();
        Vehicle airplane = new Aircraft();
        Vehicle[] vehicles = new Vehicle[]{aircraft, train, bus, eurotrain, airplane};
        for (Vehicle vehicle : vehicles) {
            vehicle.info();
            vehicle.move();
        }
    }
}
