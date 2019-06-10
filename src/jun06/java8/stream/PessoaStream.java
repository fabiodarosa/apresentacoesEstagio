package jun06.java8.stream;

import java.util.ArrayList;
import java.util.Objects;

public class PessoaStream {
    private String nome;
    private static ArrayList<PessoaStream> pessoas;

    static {
        pessoas = new ArrayList<>();
        pessoas.add(new PessoaStream("Fabio"));
        pessoas.add(new PessoaStream("Júlia"));
        pessoas.add(new PessoaStream("Vitor"));
        pessoas.add(new PessoaStream("Amanda"));
        pessoas.add(new PessoaStream("Bruna"));
        pessoas.add(new PessoaStream("Fernando"));
    }

    public PessoaStream(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public static ArrayList<PessoaStream> getPessoas() {
        return pessoas;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PessoaStream that = (PessoaStream) o;
        return Objects.equals(nome, that.nome);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome);
    }
}
