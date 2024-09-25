package org.iesvdm.ejercicios.onlineShopping;

public class Supplier {
    private String name;
    private String address;
    private String phone;


    public Supplier(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }
    public Supplier setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getName() {
        return name;
    }
    public Supplier setName(String name) {
        this.name = name;
        return this;
    }
    public String getPhone() {
        return phone;
    }
    public Supplier setPhone(String phone) {
        this.phone = phone;
        return this;
    }

    @Override
    public String toString() {
        return "Supplier{" +
                "address='" + address + '\'' +
                ", name='" + name + '\'' +
                ", phone='" + phone + '\'' +
                '}';
    }
}
