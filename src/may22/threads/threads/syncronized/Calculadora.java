package may22.threads.threads.syncronized;

public class Calculadora {

    private int soma;

    public synchronized int somaArray(int[] array) {
        soma = 0;

        for (int i = 0; i < array.length; i++) {
            soma += array[i];


            System.out.println(Thread.currentThread().getName() + "-" + soma);
        }
        return soma;
    }
}

