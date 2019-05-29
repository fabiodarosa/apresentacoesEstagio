package may15.oop.heranca;

import may15.interfaces.Pesado;

public abstract class Animal implements Pesado {
    private int peso;
    private String cor;

    public void comer(){
        System.out.println("Comendo");
    }

    public void dormir(){
        System.out.println("Dormindo");
    }

    @Override
    public int obterPeso() {
        return this.peso;
    }
}
