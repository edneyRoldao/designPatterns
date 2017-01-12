package cases.discount;

import java.util.List;

public class Pedido {

	private FormaPagamento formaPagamento;
	private Cliente cliente;
	private List<Item> itens;
	private DescontoStrategy descontoStrategy;

	// Constructors
	public Pedido(FormaPagamento formaPagamento, Cliente cliente, List<Item> itens, DescontoStrategy descontoStrategy) {
		this.formaPagamento = formaPagamento;
		this.cliente = cliente;
		this.itens = itens;
		this.descontoStrategy = descontoStrategy;
	}
	public Pedido(FormaPagamento formaPagamento, Cliente cliente, List<Item> itens) {
		this.formaPagamento = formaPagamento;
		this.cliente = cliente;
		this.itens = itens;
		this.descontoStrategy = new SemDescontoStrategy();
	}

	
	// Methods 
	public double calcularTotal() {
		return getTotalItens() - descontoStrategy.calcularDesconto(this);
	}

	public void setTipoDesconto(DescontoStrategy descontoStrategy) {
		this.descontoStrategy = descontoStrategy;
	}

	public double getTotalItens() {
		double total = 0;

		for (Item i : itens)
			total += i.getPreco();

		return total;
	}

	
	// Getters and Setters
	public FormaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(FormaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Item> getItens() {
		return itens;
	}

	public void setItens(List<Item> itens) {
		this.itens = itens;
	}

}
