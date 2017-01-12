package cases.discount;

public class ValorTotalDescontoStrategy implements DescontoStrategy {

	@Override
	public double calcularDesconto(Pedido pedido) {
		
		if(pedido.getTotalItens() <= 100) {
			return pedido.getTotalItens() * 0.05;
		} else if(pedido.getTotalItens() > 100 && pedido.getTotalItens() <= 500) {
			return pedido.getTotalItens() * 0.15;
		} else if(pedido.getTotalItens() > 500 && pedido.getTotalItens() <= 100) {
			return pedido.getTotalItens() * 0.2;
		} else {
			return pedido.getTotalItens() * 0.25;
		}
		
	}

}
