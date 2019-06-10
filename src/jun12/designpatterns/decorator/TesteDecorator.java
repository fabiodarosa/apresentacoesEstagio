package jun12.designpatterns.decorator;

public class TesteDecorator {
    public static void main(String[] args) {

        Pedido pedido = new PedidoBase();
        pedido.adicionarItem(10);
        pedido = new DecoradorAnotacao(pedido, "Anotacao");
        pedido = new DecoradorAnotacao(pedido, "Anotacao2");
        System.out.println(pedido.exibirPedido());


/*
        Pedido pedido2 = new DecoradorAnotacao(pedido, "anotação 01");


        pedido2.adicionarItem(5);

        System.out.println("Pedido 01 - " + pedido.exibirPedido());
        System.out.println(pedido2.exibirPedido());
*/
    }
}
