package ru.job4j.pojo;

public class Book {
    private String name;
    private int quantity;

    public Book(String name, int count) {
        this.name = name;
        this.quantity = count;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
