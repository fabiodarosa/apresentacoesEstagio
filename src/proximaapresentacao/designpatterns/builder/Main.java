package proximaapresentacao.designpatterns.builder;

public class Main {
    public static void main(String[] args) {
        Conta conta = new ContaBuilder()
                .setNumeroConta(10)
                .setPessoa("Fábio", 19)
                .build();

    }

}
