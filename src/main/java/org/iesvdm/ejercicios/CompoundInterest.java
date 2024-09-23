package org.iesvdm.ejercicios;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class CompoundInterest {
    public static void main(String[] args) {


        /*
            c = p(1 +r)^n
            p es el monto que se invirtió originalmente (es decir, el monto principal)
            r es la tasa de interés anual (por ejemplo, use 0.05 para el 5%)
            n es el número de años
            c es la cantidad depositada al final del año enésimo.
            Nota: operaciones a 10 decimales con redondeo bancario HALF_EVEN.
        */

        BigDecimal p = new BigDecimal("1000");
        BigDecimal r = new BigDecimal("0.05");
        BigDecimal n = new BigDecimal("5");
        BigDecimal uno = new BigDecimal("1");

        BigDecimal sum = uno.add(r);
        BigDecimal potencia = sum.pow(n.intValueExact());
        BigDecimal resultado = (p.multiply(potencia));
        resultado = resultado.setScale(10, RoundingMode.HALF_EVEN);

        System.out.println("Resultado: " + resultado);

    }


}

