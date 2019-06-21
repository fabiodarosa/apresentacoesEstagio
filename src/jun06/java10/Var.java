package jun06.java10;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Var {
    public static void main(String[] args) {

        ExemploObjetoComNomeGrande exemploObjetoComNomeGrande = new ExemploObjetoComNomeGrande("Exemplo 01");
        var objetoGrande = new ExemploObjetoComNomeGrande("Exemplo 02");


        var arrayList = new ArrayList<>();
        var linkedList = new LinkedList<>();

        List<List> listas = new ArrayList<>();

        listas.add(arrayList);

    }
}

