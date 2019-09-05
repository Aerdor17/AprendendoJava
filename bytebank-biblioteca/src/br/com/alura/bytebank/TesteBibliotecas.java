package br.com.alura.bytebank;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteBibliotecas {

	public static void main(String[] args) {

		Conta c = new ContaCorrente(123, 125);
		c.deposita(200.3);

	}

}
