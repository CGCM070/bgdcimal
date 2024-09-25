package org.iesvdm.ejercicios.onlineShopping;

public class Payment {

    private String id;
    private String payDate;
    private String real;
    private String details;

    public Payment(String id, String payDate, String real, String details) {
        this.id = id;
        this.payDate = payDate;
        this.real = real;
        this.details = details;
    }

    public String getDetails() {
        return details;
    }
    public Payment setDetails(String details) {
        this.details = details;
        return this;
    }
    public String getId() {
        return id;
    }
    public Payment setId(String id) {
        this.id = id;
        return this;
    }
    public String getPayDate() {
        return payDate;
    }
    public Payment setPayDate(String payDate) {
        this.payDate = payDate;
        return this;
    }
    public String getReal() {
        return real;
    }
    public Payment setReal(String real) {
        this.real = real;
        return this;
    }


}
