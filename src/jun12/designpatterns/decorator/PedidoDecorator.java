package jun12.designpatterns.decorator;

public abstract class PedidoDecorator implements Pedido {

    protected Pedido pedidoDecorado;

    public PedidoDecorator(Pedido pedidoDecorado) {
        this.pedidoDecorado = pedidoDecorado;
    }

    @Override
    public double exibirPedido() {

        return this.pedidoDecorado.exibirPedido();
    }

    @Override
    public void adicionarItem(double item) {
        this.pedidoDecorado.adicionarItem(item);
    }
}
