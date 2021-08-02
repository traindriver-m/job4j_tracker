package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book biblia = new Book("Biblia", 1217);
        Book code = new Book("Clean code", 550);
        Book bukvary = new Book("Azbuka", 70);
        Book history = new Book("History of Russia", 470);
        Book[] books = new Book[]{biblia, code, bukvary, history};

        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getQuantity() + " pages.");
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (Book book : books) {
            System.out.println(book.getName() + " - " + book.getQuantity() + " pages.");
        }

        for (Book value : books) {
            if ("Clean code".equals(value.getName())) {
                System.out.println(value.getName() + " - " + value.getQuantity() + " pages.");
            }
        }
    }
}
