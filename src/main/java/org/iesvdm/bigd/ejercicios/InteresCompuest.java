package org.iesvdm.bigd.ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class InteresCompuest {
    public static void main(String[] args) {

/*
        BigDecimal p = new BigDecimal("200");
        BigDecimal r = new BigDecimal("0.05");
        BigDecimal n = new BigDecimal("360");
        BigDecimal uno = new BigDecimal("1");

        BigDecimal sum = uno.add(r);
        BigDecimal potencia = sum.pow(5);
        BigDecimal resultado = (p.multiply(potencia));


        System.out.println("Resultado: " + resultado);
        */


        BigDecimal x = new BigDecimal("12345.6189");
        x =x.setScale(2, RoundingMode.HALF_UP);
        System.out.println("x="+x);

    }


}

