package ru.job4j.stream;

public class Vechicle {
    private String brand;
    private String type;
    private String engine;
    private int weight;
    private int power;
    private int speed;
    private int places;

    static class Builder {
        private String brand;
        private String type;
        private String engine;
        private int weight;
        private int power;
        private int speed;
        private int places;

        Builder buildBrand(String brand) {
            this.brand = brand;
            return this;
        }

        Builder buildType(String type) {
            this.type = type;
            return this;
        }

        Builder buildEngine(String engine) {
            this.engine = engine;
            return this;
        }

        Builder buildWeight(int weight) {
            this.weight = weight;
            return this;
        }

        Builder buildPower(int power) {
            this.power = power;
            return this;
        }

        Builder buildSpeed(int speed) {
            this.speed = speed;
            return this;
        }

        Builder buildPlaces(int places) {
            this.places = places;
            return this;
        }

        Vechicle builder() {
            Vechicle vechicle = new Vechicle();
            vechicle.brand = brand;
            vechicle.type = type;
            vechicle.engine = engine;
            vechicle.weight = weight;
            vechicle.power = power;
            vechicle.speed = speed;
            vechicle.places = places;
            return vechicle;

        }
    }
}
