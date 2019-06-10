package jun12.designpatterns.decorator;

public class DecoradorAnotacao extends PedidoDecorator {

    String anotacao;


    public DecoradorAnotacao(Pedido pedidoDecorado, String anotacao) {
        super(pedidoDecorado);
        this.anotacao = anotacao;
    }

    private void mostrarAnotacao() {
        System.out.println(anotacao);
    }

    @Override
    public double exibirPedido() {
        mostrarAnotacao();
        return super.exibirPedido();

    }
}
