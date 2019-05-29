package may22.threads;

public class MinhaThread extends Thread {
    String nome;
    int tempo;

    public MinhaThread(String nome, int tempo) {
        this.tempo = tempo;
        this.nome = nome;
        start();
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println(nome + " Contador - " + i);

            try {
                Thread.sleep(tempo);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

        }
        System.out.println("Terminou a execução!");
    }
}
