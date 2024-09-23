package org.iesvdm.bigd.ejercicios;

import java.math.BigInteger;

public class FactorialBigDecimal {
    public static void main(String[] args) {

        BigInteger number = new BigInteger("5");
        new FactorialBigDecimal().calculateFactorial(number);
        System.out.println(new FactorialBigDecimal().calculateFactorial(number));
    }


    public BigInteger calculateFactorial(BigInteger number) {
        if (number.compareTo(BigInteger.ZERO) == 0) {
            return BigInteger.ONE;
        } else {
            return number.multiply(calculateFactorial(number.subtract(BigInteger.ONE)));
        }
    }
}
