package proximaapresentacao.java8.lambdas;

import java.util.function.Predicate;

public class TesteLambda {

    public static void main(String[] args) {

        Integer valorTestado = 4;

        Predicate<Integer> valorPar = v -> v % 2 == 0;

        System.out.println(valorPar.test(valorTestado));

        Runnable r = TesteLambda::exibirNumero;

        Thread t1 = new Thread(r);
        Thread t2 = new Thread(r);
        t1.start();
        t2.start();
    }

    private static void exibirNumero() {
        for (int i = 1; i <= 1000; i++) {
            System.out.println(i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
