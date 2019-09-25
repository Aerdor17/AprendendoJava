package br.com.bytebank.banco.test.util;

import java.util.ArrayList;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayListEquals {

	public static void main(String[] args) {		
		
		/* ContaCorrente cc1 = new ContaCorrente(11, 22);
		ContaCorrente cc2 = new ContaCorrente(11, 22);
		
		boolean igual = cc1.ehIgual(cc2);
		System.out.println("a conta é: "+ igual); */
		
		//GENERICS
		ArrayList <Conta> lista = new ArrayList <Conta>();
		
		ArrayList <String> nomes = new ArrayList <String>();

		ContaCorrente cc1 = new ContaCorrente(22, 11);
		lista.add(cc1);

		ContaPoupanca cc2 = new ContaPoupanca(22, 22);
		lista.add(cc2);		
		
		ContaCorrente cc3 = new ContaCorrente(22, 22);
		
		boolean exists = lista.contains(cc3);
		System.out.println("Já existe: "+ exists);
		
		for (Conta contas : lista) { 
			System.out.println(contas);
		} 

	}

}
