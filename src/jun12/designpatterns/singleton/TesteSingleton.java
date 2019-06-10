package jun12.designpatterns.singleton;


public class TesteSingleton {
    public static void main(String[] args) {
//      MeuExemploSingleton ex01 = new MeuExemploSingleton(); Não tem acesso ao construtor privado
        MeuExemploSingleton ex02 = MeuExemploSingleton.getInstancia();


    }
}
