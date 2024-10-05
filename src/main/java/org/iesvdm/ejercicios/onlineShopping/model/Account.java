package org.iesvdm.ejercicios.onlineShopping.model;

import java.util.TreeMap;

public class Account {
    private String id;
    private Address billingAddress;
    private boolean isClosed;
    private String openDate;
    private String closeDate;
    private TreeMap<String, Order> orders = new TreeMap<>();
    private TreeMap<String, Payment> payments = new TreeMap<>();
    private ShoppingCart shoppingCart;


    public Account(String id, Address billingAddress, boolean isClosed, String OpenDate, String CloseDate) {
        this.id = id;
        this.billingAddress = billingAddress;
        this.isClosed = isClosed;
        this.openDate = OpenDate;
        this.closeDate = CloseDate;
    }

    public Address getBillingAddress() {
        return billingAddress;
    }

    public Account setBillingAddress(Address billingAddress) {
        this.billingAddress = billingAddress;
        return this;
    }

    public String getCloseDate() {
        return closeDate;
    }

    public Account setCloseDate(String closeDate) {
        this.closeDate = closeDate;
        return this;
    }

    public String getId() {
        return id;
    }

    public Account setId(String id) {
        this.id = id;
        return this;
    }

    public boolean isClosed() {
        return isClosed;
    }

    public Account setClosed(boolean closed) {
        isClosed = closed;
        return this;
    }

    public String getOpenDate() {
        return openDate;
    }

    public Account setOpenDate(String openDate) {
        this.openDate = openDate;
        return this;
    }

    public TreeMap<String, Order> getOrders() {
        return orders;
    }

    public Account setOrders(TreeMap<String, Order> orders) {
        this.orders = orders;
        return this;
    }

    public Account addOrder(Order order) {
        this.orders.put(order.getNumber_Id(), order);
        return this;
    }

    public Account removeOrder(String number_Id) {
        this.orders.remove(number_Id);
        return this;
    }

    public Order getOrder(String number_Id) {
        return this.orders.get(number_Id);
    }

    public TreeMap<String, Payment> getPayments() {
        return payments;
    }

    public Account setPayments(TreeMap<String, Payment> payments) {
        this.payments = payments;
        return this;
    }

    public Account addPayment(Payment payment) {
        this.payments.put(payment.getId(), payment);
        return this;
    }

    public Account removePayment(String id) {
        this.payments.remove(id);
        return this;
    }

    public Payment getPayment(String id) {
        return this.payments.get(id);
    }

    public ShoppingCart getShoppingCart() {
        return shoppingCart;
    }

    public Account setShoppingCart(ShoppingCart shoppingCart) {
        this.shoppingCart = shoppingCart;
        return this;
    }
}
