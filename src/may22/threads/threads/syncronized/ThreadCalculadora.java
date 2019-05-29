package may22.threads.threads.syncronized;


public class ThreadCalculadora implements Runnable {
    private String nome;
    private int[] nums;
    private static Calculadora calc = new Calculadora();


    public ThreadCalculadora(String nome, int[] nums) {
        this.nome = nome;
        this.nums = nums;
        new Thread(this, nome).start();
    }

    @Override
    public void run() {
        System.out.println(nome + "Iniciado");
        int total = calc.somaArray(this.nums);
        System.out.println(nome + " - " + total);

    }
}

