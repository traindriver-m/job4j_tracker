package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book biblia = new Book("Biblia", 1217);
        Book code = new Book("Clean code", 550);
        Book bukvary = new Book("Azbuka", 70);
        Book history = new Book("History of Russia", 470);
        Book[] books = new Book[]{biblia, code, bukvary, history};

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getQuantity() + " pages.");
        }

        Book temp = books[0];
        books[0] = books[3];
        books[3] = temp;

        for (int index = 0; index < books.length; index++) {
            Book book = books[index];
            System.out.println(book.getName() + " - " + book.getQuantity() + " pages.");
        }

        for (int index = 0; index < books.length; index++) {
            if (books[index].getName().equals("Clean code")) {
                Book book = books[index];
                System.out.println(book.getName() + " - " + book.getQuantity() + " pages.");
            }
        }
    }
}
