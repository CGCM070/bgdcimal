package org.iesvdm.ejercicios.onlineShopping;

import org.iesvdm.ejercicios.onlineShopping.enums.OrderStatus;
import org.iesvdm.ejercicios.onlineShopping.model.*;

import java.math.BigDecimal;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Supplier supplier1 = new Supplier("1", "Supplier1" , "123123");


        WebUser user = new WebUser("pepe", "password1");
        Address address = new Address("Calle Falsa", "City1", "state1");
        List<Address> addresses = List.of(address);
        Customer customer = new Customer("1", "666666666", "", addresses);

        Account account = new Account("1", addresses.get(0), false, "01/01/2021", "01/09/2021");
        customer.setAccount(account);
        Payment payment = new Payment("1", "01/01/2021", "100.0", "debit");
        account.getPayments().put(payment.getId(), payment);

        Order order = new Order("1", "01/01/2021", address , OrderStatus.DELIVERED, new BigDecimal("100.0"));
        account.getOrders().put(order.getNumber_Id(), order);

        Product product = new Product("1", "Product1", supplier1);
        List<Product> products = List.of(product);

        LineItem lineItem = new LineItem(new BigDecimal("2.0"), new BigDecimal("20.13"));
        lineItem.addProduct(product);
        order.getItems().put(lineItem.getProducts().get(0).getId(), lineItem);

        ShoppingCart shoppingCart = new ShoppingCart("01/01/2021");
        shoppingCart.getItems().put(lineItem.getProducts().get(0).getId(), lineItem);

        account.setShoppingCart(shoppingCart);

        System.out.println("user: " + user);
        System.out.println("Order: " + order);
        System.out.println("account: " + account.getShoppingCart().getItems());
        System.out.println("Total: " + lineItem.getTotal());


    }
}
