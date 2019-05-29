package may22.excecoes;

public class Pessoa {
    private String nome;
    private int idade;

    public Pessoa(String nome, int idade) throws IdadeInvalidaException {
        this.nome = nome;

        verificarIdade(idade);
        this.idade = idade;
    }

    public void verificarIdade(int idade) throws IdadeInvalidaException {
        if (idade < 1) {
            throw new IdadeInvalidaException("A idade tem que ser maior que 0");
        } else {
            this.idade = idade;
        }
    }
}


