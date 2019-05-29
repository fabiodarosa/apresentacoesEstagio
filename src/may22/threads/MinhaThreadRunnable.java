package may22.threads;

public class MinhaThreadRunnable implements Runnable {

    String nome;
    int tempo;

    public MinhaThreadRunnable(String nome, int tempo) {
        this.nome = nome;
        this.tempo = tempo;
        new Thread(this).start();
    }

    @Override
    public void run() {

        for (int i = 0; i < 1000; i++) {
            System.out.println(nome + " - " + i);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

    }
}

