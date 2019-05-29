package may15.oop.polimorfismo;

import may15.oop.heranca.Animal;
import may15.oop.heranca.Cachorro;
import may15.oop.heranca.Coelho;

import java.util.ArrayList;

public class TestePolimorfismo {
    public static void main(String[] args) {
        Animal cachorro = new Cachorro();
        Animal coelho = new Coelho();

        ArrayList<Animal> animals = new ArrayList<>();

        animals.add(cachorro);
        animals.add(coelho);
    }
}
