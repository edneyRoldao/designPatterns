package cases.discount;


public class FormaPagamentoDescontoStrategy implements DescontoStrategy {

	@Override
	public double calcularDesconto(Pedido pedido) {
		
		if(pedido.getFormaPagamento() == FormaPagamento.CREDITO) {
			return pedido.getTotalItens() * 0.05;
		} else if(pedido.getFormaPagamento() == FormaPagamento.DEBITO) {
			return pedido.getTotalItens() * 0.1;
		} else {
			return pedido.getTotalItens() * 0.2;
		}
		
	}

}
