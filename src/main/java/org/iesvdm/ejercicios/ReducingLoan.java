package org.iesvdm.ejercicios;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class ReducingLoan {
    public static void main(String[] args) {

        /*
        * PMT = (P*r)/(1-(1+r)^-n)
        * PMT: Es el pago mensual (o periódico, según la frecuencia de pagos).
        * P: Es el principal o monto original del préstamo.
        * r: Es la tasa de interés mensual. Si la tasa de interés anual es del 5%, el valor mensual es 0.05/12.
        * n: Es el número total de pagos (en meses). Para un préstamo a 30 años, sería 30×12=360 meses
        *   noMasr = 1 +r
        *   unoMasrALaN = (1+r)^n
        *   denominador =  1 - (1 + r)^-n
        *   PMT = (P*r)/(1-(1+r)^-n)
        *
        * */
        BigDecimal inter = new BigDecimal("0.05");
        BigDecimal years = new BigDecimal("12");
        BigDecimal montoPres = new BigDecimal("200.000");
        BigDecimal numPagos = new BigDecimal("360");

        BigDecimal r = inter.divide(years, 10, RoundingMode.HALF_UP);

        BigDecimal uno = BigDecimal.ONE;
        BigDecimal unoMasR = uno.add(r);

        //(1 + r)^n
        BigDecimal unoMasrALaN = unoMasR.pow(numPagos.intValue()).setScale(10, RoundingMode.HALF_UP);
        //(1 + r)^-n
        BigDecimal unoMasrALaNInvertido = BigDecimal.ONE.divide(unoMasrALaN, 10, RoundingMode.HALF_UP);
        //1 - (1 + r)^-n
        BigDecimal denominador = uno.subtract(unoMasrALaNInvertido);
        //PMT
        BigDecimal PMT = (montoPres.multiply(r)).divide(denominador, 10, RoundingMode.HALF_UP);
        System.out.println("Pago mensual (PMT): " + PMT);







    }
}
