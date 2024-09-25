package org.iesvdm.ejercicios.n5;

public class ShoppingCart {

    private String creationDate;

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
    @Override
    public String toString() {
        return "ShoppingCart{" +
                "creationDate='" + creationDate + '\'' +
                '}';
    }
}
