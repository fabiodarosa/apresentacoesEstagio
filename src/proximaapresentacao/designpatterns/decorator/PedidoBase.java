package proximaapresentacao.designpatterns.decorator;

public class PedidoBase implements Pedido {
    private double total;

    @Override
    public double exibirPedido() {
        return this.total;
    }

    @Override
    public void adicionarItem(double item) {
        this.total += item;
    }

}
