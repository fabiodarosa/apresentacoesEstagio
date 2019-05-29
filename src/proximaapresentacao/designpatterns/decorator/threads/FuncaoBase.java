package proximaapresentacao.designpatterns.decorator.threads;

public class FuncaoBase implements Funcao {

    private final int vezes;

    public  FuncaoBase(int vezes){
        this.vezes = vezes;
    }

    @Override
    public void executar() {
        for(int i = 1; i<=vezes;i++){
            System.out.println(i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
