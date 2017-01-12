package cases.discount;


public enum FormaPagamento {

	CREDITO("credito"), DEBITO("debito"), DINHEIRO("dinheiro");
	
	private String label;
	
	private FormaPagamento(String label) {
		this.label = label;
	}
	
	public String getLabel() {
		return label;
	}
	
}
