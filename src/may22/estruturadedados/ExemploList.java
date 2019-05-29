package may22.estruturadedados;

import java.util.*;

public class ExemploList {
    public static void main(String[] args) {


        List<String> lista = new ArrayList<>();
        lista.add("Nome 01");
        lista.add("Nome 02");
        lista.add("Nome 03");


        Collections.synchronizedList(lista);

        for (String s : lista) {
            System.out.print(s + " ");
        }
        System.out.println();

        if (lista.contains("Nome 02")) {
            System.out.println("SIM");
        }

        System.out.println(lista.get(1));


        lista.remove("Item 02");
        for (String s : lista) {
            System.out.print(s + " ");
        }
        System.out.println();
        System.out.println(lista.isEmpty());
        lista.clear();
        System.out.println(lista.isEmpty());

    }

}

