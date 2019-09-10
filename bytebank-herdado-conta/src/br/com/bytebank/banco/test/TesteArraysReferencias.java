package br.com.bytebank.banco.test;

import br.com.bytebank.banco.modelo.ContaCorrente;

public class TesteArraysReferencias {
	
	public static void main(String[] args) {
		
		//int[] idades = new idades[5];
		ContaCorrente[] contas = new ContaCorrente[5]; //array
		ContaCorrente cc1 = new ContaCorrente(11,22); // Conta Corrente
		//acessando o array na posição 01
		contas[0] = cc1;
		
		ContaCorrente cc2 = new ContaCorrente(12, 33);
		contas[1] = cc2;
		
		System.out.println(contas[1].getNumero());
		
		ContaCorrente ref = contas[1];
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		
		
		
	}

}
