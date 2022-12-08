package br.com.fiap.shift.loja;
import javax.swing.JOptionPane;

import br.com.fiap.shift.loja.model.CEP;

public class TestaCEP {

	public static void main(String[] args) {

		CEP cep = new CEP(JOptionPane.showInputDialog("Insira o CEP"));

		System.out.println(cep);

	}

}
