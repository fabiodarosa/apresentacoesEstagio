package may22.excecoes;

import java.util.Scanner;

public class ExceptionsExemplo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        mudarIdade(sc.nextInt());
    }

    public static void mudarIdade(int idade) {

        Pessoa pessoa = null;
        try {
            pessoa = new Pessoa("Fabio", idade);
        } catch (IdadeInvalidaException e) {
            e.printStackTrace();
        }
    }
}


