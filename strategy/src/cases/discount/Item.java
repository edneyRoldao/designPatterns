package cases.discount;


import java.io.Serializable;

public class Item implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private String descricao;
	private double preco;
	
	
	public Item(String descricao, double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

}
