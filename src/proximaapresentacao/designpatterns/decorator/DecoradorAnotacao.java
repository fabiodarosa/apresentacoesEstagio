package proximaapresentacao.designpatterns.decorator;

public class DecoradorAnotacao extends PedidoDecorator {

    String anotacao;


    public DecoradorAnotacao(Pedido pedidoDecorado, String anotacao) {
        super(pedidoDecorado);
        this.anotacao = anotacao;
    }

    public void mostrarAnotacao() {
        System.out.println(anotacao);
    }

    @Override
    public double exibirPedido() {

        return super.exibirPedido();

    }
}
