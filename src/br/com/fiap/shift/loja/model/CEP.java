package br.com.fiap.shift.loja.model;
public class CEP implements Validavel<String> {

	String numero;

	public CEP(String numero) {

		if (validar(numero)) {
			this.numero = numero;

		} else {
			throw new RuntimeException("O CEP " + numero + " É INVALIDO!");
		}

	}

	@Override
	public boolean validar(String s) {
		return s.matches("[0-9]{5}-[0-9]{3}");
	}

	@Override
	public String toString() {
		return numero;
	}
}
