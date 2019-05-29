package may15.oop.abstracao;

public class Conta {
    private int numero;
    private double saldo;
    private double limite;

    void depositar(double valor) {
        this.saldo += valor;
    }

    void sacar(double valor){
        this.saldo -= valor;
    }

    void imprimirExtrato(){
        System.out.println("Saldo: "+this.saldo);
    }
}
