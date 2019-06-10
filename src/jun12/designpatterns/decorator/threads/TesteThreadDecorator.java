package jun12.designpatterns.decorator.threads;

public class TesteThreadDecorator {
    public static void main(String[] args) {


        Funcao f1 = new FuncaoBase(200);
        Funcao f2 = new FuncaoBase(150);

        f1 = new ThreadDecorator(f1);

        f1.executar();
        f2.executar();
    }
}
