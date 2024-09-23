package org.iesvdm.ejercicios.haservine;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Position pos1 = new Position(36.7213028f, -4.4216366f); // Málaga
        Position pos2 = new Position(40.4167754f, -3.7037902f); // Madrid

        BigDecimal distancia = Position.Extension.distanciaEnKm(pos1, pos2);
        System.out.println("La distancia entre Málaga y Madrid es: " + distancia + " km");
    }
}
