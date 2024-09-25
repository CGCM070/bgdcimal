package org.iesvdm.ejercicios.onlineShopping;

public class Product {
    private String id;
    private String name;
    private Supplier supplier;

    public Product(String id, String name, Supplier supplier) {
        this.id = id;
        this.name = name;
        this.supplier = supplier;
    }

    public String getId() {
        return id;
    }
    public Product setId(String id) {
        this.id = id;
        return this;
    }
    public String getName() {
        return name;
    }
    public Product setName(String name) {
        this.name = name;
        return this;
    }
    public Supplier getSupplier() {
        return supplier;
    }
    public Product setSupplier(Supplier supplier) {
        this.supplier = supplier;
        return this;
    }


    @Override
    public String toString() {
        return "Product{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", supplier=" + supplier +
                '}';
    }
}
