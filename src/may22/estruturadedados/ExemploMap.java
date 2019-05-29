package may22.estruturadedados;

import java.util.*;

public class ExemploMap {
    public static void main(String[] args) {

        Map<String, String> map = new TreeMap<>();

        map.put("Dó", "C");
        map.put("Ré", "D");
        map.put("Mi", "E");
        map.put("Fá", "F");
        map.put("Sol", "G");
        map.put("Lá", "A");
        map.put("Si", "B");

        System.out.println(map.get("G"));

        Set<String> keySet = map.keySet();

        System.out.println(map.entrySet());

        for (String s : keySet) {
            System.out.print(s + " ");
        }
        System.out.println();

    }
}
