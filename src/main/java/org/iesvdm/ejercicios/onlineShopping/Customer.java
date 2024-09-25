package org.iesvdm.ejercicios.onlineShopping;

import java.util.List;

public class Customer {
    private String id;
    private String phone;
    private String email;
    private List<Address> address;
    private Account account;

    public Customer(String id, String phone, String email, List<Address> address) {
        this.id = id;
        this.phone = phone;
        this.email = email;
        this.address = address;
    }

    public List<Address> getAddress() {
        return address;
    }
    public void setAddress(List<Address> address) {
        this.address = address;
    }
    public String getEmail() {
        return email;
    }
    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getId() {
        return id;
    }

    public Customer setId(String id) {
        this.id = id;
        return this;
    }
    public String getPhone() {
        return phone;
    }
    public Customer setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    public Account getAccount() {
        return account;
    }
    public Customer setAccount(Account account) {
        this.account = account;
        return this;
    }

}
