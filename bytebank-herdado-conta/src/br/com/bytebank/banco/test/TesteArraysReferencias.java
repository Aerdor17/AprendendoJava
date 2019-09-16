package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.Cliente;
import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArraysReferencias {
	
	public static void main(String[] args) {
		
		
		//Conta[] contas = new Conta[5]; //array para todos os tipos de referencia a Contas
		Object[] referencias = new Object[5]; // array mais generico  que  possibilita guardar qualquer tipo de referencia
				
		ContaCorrente cc1 = new ContaCorrente(11,22); // Conta Corrente
		referencias[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(12, 33);
		referencias[1] = cc2;
		
		Cliente cli = new Cliente();
		referencias[1] = cli;
		
		

		Conta ref = (Conta) referencias[1];
		//ContaPoupanca ref = (ContaPoupanca) contas[1]; // type cast
		System.out.println(((Conta) referencias[1]).getNumero());
		System.out.println(cc1.getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
	
		
		
		
	}

}
