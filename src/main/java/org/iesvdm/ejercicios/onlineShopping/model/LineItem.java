package org.iesvdm.ejercicios.onlineShopping.model;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.ArrayList;
import java.util.List;

public class LineItem {
    MathContext mc = new MathContext(2, RoundingMode.HALF_UP);

    private BigDecimal quantity;
    private BigDecimal price;
    private List<Product> products = new ArrayList<>();

    public LineItem(BigDecimal price, BigDecimal quantity) {
        this.price = price;
        this.quantity = quantity;
    }

    public MathContext getMc() {
        return mc;
    }
    public LineItem setMc(MathContext mc) {
        this.mc = mc;
        return this;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public LineItem setPrice(BigDecimal price) {
        this.price = price;
        return this;
    }
    public BigDecimal getQuantity() {
        return quantity;
    }
    public LineItem setQuantity(BigDecimal quantity) {
        this.quantity = quantity;
        return this;
    }
    public List<Product> getProducts() {
        return products;
    }
    public LineItem setProducts(List<Product> products) {
        this.products = products;
        return this;
    }
    public LineItem addProduct(Product product) {
        products.add(product);
        return this;
    }
    public BigDecimal getTotal() {
        return price.multiply(quantity, mc);
    }


    @Override
    public String toString() {
        return "LineItem{" +
                "mc=" + mc +
                ", quantity=" + quantity +
                ", price=" + price +
                ", products=" + products +
                '}';
    }
}
