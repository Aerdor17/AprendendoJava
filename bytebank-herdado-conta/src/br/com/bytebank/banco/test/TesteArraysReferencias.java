package br.com.bytebank.banco.test;


import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;
import br.com.bytebank.banco.modelo.SeguroDeVida;

public class TesteArraysReferencias {
	
	public static void main(String[] args) {
		
		
		Conta[] contas = new Conta[5]; //array para todos os tipos de referencia a Contas
		//Object[] Referencias = new Object[5]; // array mais generico  que  possibilita guardar qualquer tipo de referencia
				
		ContaCorrente cc1 = new ContaCorrente(11,22); // Conta Corrente
		contas[0] = cc1;
		
		ContaPoupanca cc2 = new ContaPoupanca(12, 33);
		contas[1] = cc2;
		
//		SeguroDeVida sv = new SeguroDeVida();		
//		contas[2] = sv;		
//		Object refGenerica = Conta[10];
//		System.out.println(refGenerica.getNumero);

		Conta ref = contas[1];
		//ContaPoupanca ref = (ContaPoupanca) Referencias[1]; // type cast
		System.out.println(cc1.getNumero());
		System.out.println(cc2.getNumero());
		System.out.println(ref.getNumero());
		//System.out.println(sv.getValorImposto());
		
		
		
	}

}
