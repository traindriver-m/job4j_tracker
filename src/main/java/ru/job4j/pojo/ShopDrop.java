package ru.job4j.pojo;

public class ShopDrop {
    public static Product[] delete(Product[] products, int index) {
        for (int cell = index; cell < products.length - 1; cell++) {
            products[cell] = products[cell + 1];
        }
        products[products.length - 1] = null;
        return products;
    }
}
