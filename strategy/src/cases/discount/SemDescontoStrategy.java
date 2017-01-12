package cases.discount;

public class SemDescontoStrategy implements DescontoStrategy {

	@Override
	public double calcularDesconto(Pedido pedido) {
		return 0;
	}

}
