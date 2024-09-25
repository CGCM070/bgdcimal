package org.iesvdm.ejercicios.onlineShopping;

import java.util.TreeMap;

public class ShoppingCart {

    private String creationDate;
    private TreeMap<String, LineItem> items = new TreeMap<>();

    public ShoppingCart(String creationDate) {
        this.creationDate = creationDate;
    }

    public String getCreationDate() {
        return creationDate;
    }
    public ShoppingCart setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }

    public TreeMap<String, LineItem> getItems() {
        return items;
    }

    public ShoppingCart setItems(TreeMap<String, LineItem> items) {
        this.items = items;
        return this;
    }

    @Override
    public String toString() {
        return "ShoppingCart{" +
                "creationDate='" + creationDate + '\'' +
                '}';
    }
}
