package may15.statics;

import java.util.ArrayList;

public class ExemploStatics {

    private static ArrayList<String> atributoStatic = new ArrayList<>();//Atributo Estático

    static { // Bloco Estático
        atributoStatic.add("Nome 01");
        atributoStatic.add("Nome 02");
        atributoStatic.add("Nome 03");
        atributoStatic.add("Nome 04");
    }

    public static ArrayList<String> getAtributoStatic() { //Método Estático
        return atributoStatic;
    }

    public static class ClasseStatic { // Classe Estática
        public static void imprime() {
            for (String s : atributoStatic) {
                System.out.println(s);
            }
        }
    }


}
