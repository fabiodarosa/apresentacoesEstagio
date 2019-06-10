package jun06.java11.localvariableinferencelambda;

public class LocalVariableInferenceForLambda {
    public static void main(String[] args) {

        InterfaceFuncional<Integer> metodo = (num1, num2) -> num1 + num2;
       // InterfaceFuncional<Integer> metodo2 = (@Anotacao var num1, var num2) -> num1 + num2;

        int resultado = metodo.soma(1,2);
       // int resultado2 = metodo2.soma(1,2);

        System.out.println(resultado);
  //      System.out.println(resultado2);
    }
}
