package jun12.designpatterns.decorator.threads;

public class ThreadDecorator implements Funcao {

    Funcao f;

    public ThreadDecorator(Funcao f) {
        this.f = f;
    }

    @Override
    public void executar() {

        Runnable r = () -> f.executar();

        new Thread(r).start();
    }
}
