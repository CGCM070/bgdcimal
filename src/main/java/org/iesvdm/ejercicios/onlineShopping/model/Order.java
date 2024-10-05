package org.iesvdm.ejercicios.onlineShopping.model;

import org.iesvdm.ejercicios.onlineShopping.enums.OrderStatus;

import java.math.BigDecimal;
import java.util.Iterator;
import java.util.TreeMap;

public class Order {
    private String number_Id;
    private String orderDate;
    private String shippingDate;
    private Address ship_to;
    private OrderStatus status;
    private BigDecimal total;
    private TreeMap<String, LineItem> items = new TreeMap<>();

    public Order(String number_Id, String orderDate,Address ship_to, OrderStatus status, BigDecimal total) {
        this.number_Id = number_Id;
        this.orderDate = orderDate;
        this.ship_to = ship_to;
        this.status = status;
        this.total = total;
    }

    public String getNumber_Id() {
        return number_Id;
    }
    public Order setNumber_Id(String number_Id) {
        this.number_Id = number_Id;
        return this;
    }

    public String getOrderDate() {
        return orderDate;
    }
    public Order setOrderDate(String orderDate) {
        this.orderDate = orderDate;
        return this;
    }
    public Address getShip_to() {
        return ship_to;
    }
    public Order setShip_to(Address ship_to) {
        this.ship_to = ship_to;
        return this;
    }
    public String getShippingDate() {
        return shippingDate;
    }
    public Order setShippingDate(String shippingDate) {
        this.shippingDate = shippingDate;
        return this;
    }
    public OrderStatus getStatus() {
        return status;
    }
    public Order setStatus(OrderStatus status) {
        this.status = status;
        return this;
    }
    public BigDecimal getTotal() {
        return total;
    }
    public Order setTotal(BigDecimal total) {
        this.total = total;
        return this;
    }
    public TreeMap<String, LineItem> getItems() {
        return items;
    }
    public Order setItems(TreeMap<String, LineItem> items) {
        this.items = items;
        return this;
    }
    public Order addItem(LineItem item) {
        Iterator<Product> it = item.getProducts().iterator();
        while (it.hasNext()) {
            Product product = it.next();
            this.items.put(product.getId(), item);
        }
        return this;
    }


    @Override
    public String toString() {
        return "Order{" +
                "number_Id='" + number_Id + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", shippingDate='" + shippingDate + '\'' +
                ", ship_to=" + ship_to +
                ", status=" + status +
                ", total=" + total +
                '}';
    }
}
