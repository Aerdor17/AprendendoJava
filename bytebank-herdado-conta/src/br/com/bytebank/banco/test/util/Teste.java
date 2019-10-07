package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class Teste {

	public static void main(String[] args) {

		Conta cc1 = new ContaCorrente(22, 33);
		Cliente clienteCC1 = new Cliente();
		clienteCC1.setNome("Nico");
		cc1.setTitular(clienteCC1);
		cc1.deposita(333.0);

		Conta cc2 = new ContaPoupanca(22, 44);
		Cliente clienteCC2 = new Cliente();
		clienteCC2.setNome("Guilherme");
		cc2.setTitular(clienteCC2);
		cc2.deposita(444.0);

		Conta cc3 = new ContaCorrente(22, 11);
		Cliente clienteCC3 = new Cliente();
		clienteCC3.setNome("Paulo");
		cc3.setTitular(clienteCC3);
		cc3.deposita(111.0);

		Conta cc4 = new ContaPoupanca(22, 22);
		Cliente clienteCC4 = new Cliente();
		clienteCC4.setNome("Ana");
		cc4.setTitular(clienteCC4);
		cc4.deposita(222.0);

		List<Conta> lista = new ArrayList<>();
		lista.add(cc1);
		lista.add(cc2);
		lista.add(cc3);
		lista.add(cc4);

		for (Conta conta : lista) {
			System.out.println(conta);
		}

		// ordenador da lista
		NumeroDaContaComparator comparator = new NumeroDaContaComparator(); // instancia da class comparadora
																			// "NumeroDaContaComparator" e
		TitularDaContaComparator titularComparator = new TitularDaContaComparator();
		lista.sort(titularComparator); // passei para o metododo sort

		System.out.println("---------------------");

		for (Conta conta : lista) { // o for � para listar todas as contas da lista
			System.out.println(conta + ", " + conta.getTitular().getNome());
		}
	}

}

class TitularDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		String nomeTitularC1 = c1.getTitular().getNome();
		String nomeTitularC2 = c2.getTitular().getNome();
		return nomeTitularC1.compareTo(nomeTitularC2); // compareTo compara o nomeTitularC1 com o C2 e organiza em ordem
														// alfab�tica
	}

}

class NumeroDaContaComparator implements Comparator<Conta> {

	@Override
	public int compare(Conta c1, Conta c2) {

		if (c1.getNumero() < c2.getNumero()) {
			return -1;
		}

		if (c1.getNumero() > c2.getNumero()) {
			return 1;
		}

		return 0; // se for o mesmo numero retorna 0
	}

}
