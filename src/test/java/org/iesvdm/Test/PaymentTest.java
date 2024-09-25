package org.iesvdm.Test;

import org.iesvdm.ejercicios.n5.Payment;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PaymentTest {

    @Test
    void setIdShouldUpdateId() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setId("2");
        assertEquals("2", payment.getId());
    }

    @Test
    void setPayDateShouldUpdatePayDate() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setPayDate("2023-11-01");
        assertEquals("2023-11-01", payment.getPayDate());
    }

    @Test
    void setRealShouldUpdateReal() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setReal("200.00");
        assertEquals("200.00", payment.getReal());
    }

    @Test
    void setDetailsShouldUpdateDetails() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setDetails("Updated Details");
        assertEquals("Updated Details", payment.getDetails());
    }

    @Test
    void constructorShouldInitializeFields() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        assertEquals("1", payment.getId());
        assertEquals("2023-10-01", payment.getPayDate());
        assertEquals("100.00", payment.getReal());
        assertEquals("Details", payment.getDetails());
    }

    @Test
    void setIdShouldHandleNull() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setId(null);
        assertNull(payment.getId());
    }

    @Test
    void setPayDateShouldHandleNull() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setPayDate(null);
        assertNull(payment.getPayDate());
    }

    @Test
    void setRealShouldHandleNull() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setReal(null);
        assertNull(payment.getReal());
    }

    @Test
    void setDetailsShouldHandleNull() {
        Payment payment = new Payment("1", "2023-10-01", "100.00", "Details");
        payment.setDetails(null);
        assertNull(payment.getDetails());
    }
}