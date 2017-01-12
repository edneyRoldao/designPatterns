package cases.discount;

import java.io.Serializable;

public class Cliente implements Serializable {
	private static final long serialVersionUID = 1L;

	private String nome;
	private String email;
	private String address;
	
	
	public Cliente() {
	}
	
	public Cliente(String nome, String email, String address) {
		this.nome = nome;
		this.email = email;
		this.address = address;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

}
