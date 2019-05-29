package may15.oop.encapsulamento;

public class VendedorEncapsulado {
    private String nome;
    private int cpf;

    public VendedorEncapsulado() {
    }

    public void vender() {
        System.out.println("Vendendo");
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCpf() {
        return cpf;
    }

    public void setCpf(int cpf) {
        this.cpf = cpf;
    }
}
