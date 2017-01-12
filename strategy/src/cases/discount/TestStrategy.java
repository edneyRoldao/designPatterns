package cases.discount;

import java.util.ArrayList;
import java.util.List;

public class TestStrategy {
	
	public static void main(String[] args) {
		
		DescontoStrategy tipoDescPorPagto = new FormaPagamentoDescontoStrategy();
		DescontoStrategy tipodescPorValor = new ValorTotalDescontoStrategy();

		Cliente cli = new Cliente("Edney", "edney@gmail.com", "rua 2");
		
		List<Item> itens = new ArrayList<>();
		itens.add(new Item("pen driver", 35.5));
		itens.add(new Item("fone", 15.5));
		itens.add(new Item("cabo usb", 5.0));
		itens.add(new Item("ssd 250gb", 789.75));
		itens.add(new Item("windows 10", 150.98));
		itens.add(new Item("memoria ram 8gb", 250.00));
		
		Pedido pedido = new Pedido(FormaPagamento.DINHEIRO, cli, itens);
		
		// estrategia sem desconto
		System.out.println("[estrategia sem desconto]: " + pedido.calcularTotal());
		
		// estrategia de desconto por tipo de pagamento
		pedido.setTipoDesconto(tipoDescPorPagto);
		System.out.println("[estrategia desconto por tipo pagamento]: " + pedido.calcularTotal());
		
		// estrategia de desconto por valor total da compra
		pedido.setTipoDesconto(tipodescPorValor);
		System.out.println("[estrategia desconto por valor total da compra]: " + pedido.calcularTotal());
		
	}

}
