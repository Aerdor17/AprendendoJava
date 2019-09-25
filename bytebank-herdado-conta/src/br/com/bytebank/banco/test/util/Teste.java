package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		ArrayList lista = new ArrayList();

		ContaCorrente cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);

		ContaPoupanca cc2 = new ContaPoupanca(12, 33);
		lista.add(cc2);

		System.out.println("tamanho" + lista.size());

		Conta ref = (Conta) lista.get(0);
		System.out.println(ref.getNumero());

		lista.remove(0);

		System.out.println("Tamanho" + lista.size());

		ContaCorrente cc3 = new ContaCorrente(11, 22);
		lista.add(cc3);
		ContaPoupanca cc4 = new ContaPoupanca(12, 33);
		lista.add(cc4);

		for (int i = 0; i < lista.size(); i++) { // FOR DO JEITO ANTIGO
			Object oRef = lista.get(i);
			System.out.println(oRef);
		}

		System.out.println("------------");
				
		// for dando erro na lista
		for (Object o : lista) { // FOR NOVO
			System.out.println(o);
		}

	}

}
