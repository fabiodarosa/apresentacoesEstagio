package may22.estruturadedados;

import java.util.LinkedHashSet;
import java.util.Set;

public class ExemploSet {
    public static void main(String[] args) {

        Set<String> set = new LinkedHashSet<>();

        set.add("Dó");
        set.add("Ré");
        set.add("Mi");
        set.add("Fá");
        set.add("Sol");
        set.add("Lá");
        set.add("Si");
        set.add("Dó");

        for (String s : set) {
            System.out.print(s + " ");
        }
        System.out.println();

        if (set.contains("Sol"))
            System.out.println("Contém");

        System.out.println(set.size());
        System.out.println(set.remove("Mi"));
        System.out.println(set.size());

        set.clear();

        if (set.isEmpty())
            System.out.println("Empty");
    }
}
