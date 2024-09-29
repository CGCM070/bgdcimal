package org.iesvdm.funcional;

import java.util.List;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {

        List<Object> objList = List.of(1, false, 3, 4, true, 6, "holanda", 8, 9, 22.00);
        List<String> strList = List.of("hola", "adios", "hasta luego", "hasta mañana", "hasta siempre");

        System.out.println(objList.stream().filter(o -> o instanceof Integer).mapToInt(o -> (int) o).average().getAsDouble());
        System.out.println("-------------------------------------------------");
        System.out.println(strList.stream().mapToInt(s -> s.length()).sum());









    }
}
