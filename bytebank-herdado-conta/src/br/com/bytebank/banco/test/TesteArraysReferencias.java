package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArraysReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new idades[5];
		//Conta[] contas = new Conta[5]; //array
		Object[] Referencias = new Object[5]; // array mais generico me possibilita guardar qualquer tipo de referencia
		
		
		ContaCorrente cc1 = new ContaCorrente(11,22); // Conta Corrente
		//acessando o array na posição 01
		Referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(12, 33);
		Referencias[1] = cc2;
		
//		Object refGenerica = contas[1];
//		System.out.println(refGenerica.getNumero);

		ContaPoupanca ref = (ContaPoupanca) Referencias[1]; // type cast
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
		
	}

}
