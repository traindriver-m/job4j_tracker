package ru.job4j.stream;

import java.util.Objects;

public class Address {
    private String city;

    private String street;

    private int home;

    private int apartment;

    public Address(String city, String street, int home, int apartment) {
        this.city = city;
        this.street = street;
        this.home = home;
        this.apartment = apartment;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public int getHome() {
        return home;
    }

    public int getApartment() {
        return apartment;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Address address = (Address) o;

        if (home != address.home) {
            return false;
        }
        if (apartment != address.apartment) {
            return false;
        }
        if (!Objects.equals(city, address.city)) {
            return false;
        }
        return Objects.equals(street, address.street);
    }

    @Override
    public int hashCode() {
        int result = city != null ? city.hashCode() : 0;
        result = 31 * result + (street != null ? street.hashCode() : 0);
        result = 31 * result + home;
        result = 31 * result + apartment;
        return result;
    }
}
