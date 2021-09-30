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

    @Override
    public String toString() {
        return "Vechicle {"
                + "brand='" + brand + '\''
                + ", type='" + type + '\''
                + ", engine='" + engine + '\''
                + ", weight=" + weight
                + ", power=" + power
                + ", speed=" + speed
                + ", places=" + places
                + '}';
    }

    public static void main(String[] args) {
        Vechicle vechicle = new Builder().buildBrand("Toyota")
                .buildEngine("4ZZ FE")
                .buildPower(101)
                .buildType("Sedan")
                .buildSpeed(235)
                .buildWeight(1385)
                .buildPlaces(5)
                .builder();
        System.out.println(vechicle.toString());
    }
}
