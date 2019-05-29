package proximaapresentacao.designpatterns.singleton;

public class MeuExemploSingleton {
    private static MeuExemploSingleton instancia;

    private MeuExemploSingleton() {
    }

    static MeuExemploSingleton getInstancia() {
        if (instancia == null) {
            synchronized (MeuExemploSingleton.class) {
                if (instancia == null)
                    instancia = new MeuExemploSingleton();
                return instancia;
            }
        }
        return instancia;
    }
}
