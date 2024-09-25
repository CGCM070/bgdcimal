package org.iesvdm.ejercicios.haservine;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;

public class Position {

    private BigDecimal latitude;
    private BigDecimal longitude;

    public Position(float latitude, float longitude) {
        this.latitude = new BigDecimal(Float.toString(latitude));
        this.longitude = new BigDecimal(Float.toString(longitude));
    }

    public BigDecimal getLatitude() {
        return latitude;
    }
    public Position setLatitude(float latitude) {
        this.latitude = new BigDecimal(Float.toString(latitude));
        return this;
    }
    public BigDecimal getLongitude() {
        return longitude;
    }
    public Position setLongitude(float longitude) {
        this.longitude = new BigDecimal(Float.toString(longitude));
        return this;
    }
    public String toString() {
        return "Position [latitude=" + latitude + ", longitude=" + longitude + "]";
    }

    //Extension full spanglish ya
    public static class Extension {
        public static final BigDecimal RADIO_TIERRA_KM = new BigDecimal("6378.0");

        public static BigDecimal distanciaEnKm(Position posOrigen, Position posDestino) {

            MathContext mc = new MathContext(10, RoundingMode.HALF_UP);

            BigDecimal lat1 = enRadianes(posOrigen.getLatitude().floatValue());
            BigDecimal lon1 = enRadianes(posOrigen.getLongitude().floatValue());

            BigDecimal lat2 = enRadianes(posDestino.getLatitude().floatValue());
            BigDecimal lon2 = enRadianes(posDestino.getLongitude().floatValue());

            BigDecimal dLat = lat2.subtract(lat1);
            BigDecimal dLon = lon2.subtract(lon1);

            BigDecimal sinDLatDiv2 = BigDecimal.valueOf(Math.sin(dLat.divide(new BigDecimal("2.0"), mc).doubleValue()));
            BigDecimal sinDLonDiv2 = BigDecimal.valueOf(Math.sin(dLon.divide(new BigDecimal("2.0"), mc).doubleValue()));

            BigDecimal a = sinDLatDiv2.pow(2)
                    .add(BigDecimal.valueOf(Math.cos(lat1.doubleValue()))
                            .multiply(BigDecimal.valueOf(Math.cos(lat2.doubleValue())))
                            .multiply(sinDLonDiv2.pow(2)));

            BigDecimal c = BigDecimal.valueOf(2)
                    .multiply(BigDecimal.valueOf(Math.atan2(Math.sqrt(a.doubleValue()), Math.sqrt(1 - a.doubleValue()))));

            BigDecimal distancia = RADIO_TIERRA_KM.multiply(c, mc);

            return distancia;
        }

        public static BigDecimal enRadianes(float valor) {
            BigDecimal valorBd = new BigDecimal(Float.toString(valor));
            BigDecimal pi = new BigDecimal(Math.PI);
            return valorBd.multiply(pi).divide(new BigDecimal("180"), 10, RoundingMode.HALF_UP);
        }
    }
}
