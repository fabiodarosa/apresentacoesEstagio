package proximaapresentacao.designpatterns.builder;

public class ContaBuilder {

    Conta instancia;

    public ContaBuilder() {
        this.instancia = new Conta();
    }

    public ContaBuilder setNumeroConta(int numeroConta) {
        instancia.setNumeroDaConta(numeroConta);
        return this;
    }

    public ContaBuilder setPessoa(String nome, int idade) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome(nome);
        pessoa.setIdade(idade);
        instancia.setTitular(pessoa);

        return this;
    }

    public Conta build(){
        return instancia;
    }


}
