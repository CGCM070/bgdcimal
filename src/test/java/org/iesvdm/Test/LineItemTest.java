package org.iesvdm.Test;

import org.iesvdm.ejercicios.onlineShopping.LineItem;
import org.iesvdm.ejercicios.onlineShopping.Product;
import org.iesvdm.ejercicios.onlineShopping.Supplier;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class LineItemTest {

    @Test
    void constructorShouldInitializeFields() {
        LineItem lineItem = new LineItem(new BigDecimal("10.00"), new BigDecimal("2"));
        assertEquals(new BigDecimal("10.00"), lineItem.getPrice());
        assertEquals(new BigDecimal("2"), lineItem.getQuantity());
    }

    @Test
    void setPriceShouldUpdatePrice() {
        LineItem lineItem = new LineItem(new BigDecimal("10.00"), new BigDecimal("2"));
        lineItem.setPrice(new BigDecimal("20.00"));
        assertEquals(new BigDecimal("20.00"), lineItem.getPrice());
    }

    @Test
    void setQuantityShouldUpdateQuantity() {
        LineItem lineItem = new LineItem(new BigDecimal("10.00"), new BigDecimal("2"));
        lineItem.setQuantity(new BigDecimal("5"));
        assertEquals(new BigDecimal("5"), lineItem.getQuantity());
    }

    @Test
    void addProductShouldAddProductToList() {
        Supplier supplier = new Supplier("1", "Supplier1", "123123");
        LineItem lineItem = new LineItem(new BigDecimal("10.00"), new BigDecimal("2"));
        Product product = new Product("Product1", "1", supplier);
        lineItem.addProduct(product);
        assertTrue(lineItem.getProducts().contains(product));
    }

    @Test
    void getTotalShouldReturnCorrectTotal() {
        LineItem lineItem = new LineItem(new BigDecimal("10.00"), new BigDecimal("2"));
        assertEquals(new BigDecimal("20.00").setScale(2, RoundingMode.HALF_UP), lineItem.getTotal());
    }

    @Test
    void setMcShouldUpdateMathContext() {
        LineItem lineItem = new LineItem(new BigDecimal("10.00"), new BigDecimal("2"));
        MathContext newMc = new MathContext(3, RoundingMode.DOWN);
        lineItem.setMc(newMc);
        assertEquals(newMc, lineItem.getMc());
    }
}
