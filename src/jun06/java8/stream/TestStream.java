package jun06.java8.stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {
    public static void main(String[] args) {
        ArrayList<PessoaStream> pessoas = PessoaStream.getPessoas();

        List<String> pessoasFiltradas =
                pessoas.stream()
                .filter(p -> p.getNome().startsWith("F"))
                .sorted((o1, o2) -> o1.getNome().compareToIgnoreCase(o2.getNome()))
                .map(PessoaStream::getNome)
                .collect(Collectors.toList());

        pessoasFiltradas.forEach(System.out::println);

    }
}