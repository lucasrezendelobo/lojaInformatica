package br.com.fiap.shift.loja.model;

public class Cidade {

	private Estado estado;

	private String nome;

	public Cidade() {

	}

	public Cidade(Estado estado, String nome) {
		super();
		this.estado = estado;
		this.nome = nome;
	}

	public Estado getEstado() {
		return estado;
	}

	public void setEstado(Estado estado) {
		this.estado = estado;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String toString() {
		return nome;
	}

}
