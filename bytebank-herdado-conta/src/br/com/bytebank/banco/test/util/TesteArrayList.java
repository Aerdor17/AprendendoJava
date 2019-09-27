package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

import br.com.bytebank.banco.modelo.Conta;
import br.com.bytebank.banco.modelo.ContaCorrente;
import br.com.bytebank.banco.modelo.ContaPoupanca;

public class TesteArrayList {

	public static void main(String[] args) {
		
		//List<String> argumentos = Arrays.asList(args); // assim eu transoformo um array em uma lista
		//List<Conta> lista = new ArrayList<Conta>(); //usa array por baixo
        //List<Conta> lista = new LinkedList<Conta>(); //lista linkada		
		//List<Conta> lista = new Vector<Conta>(); //usa array por baixo, mas tbm é threadsafe
		
		
		//Generics
		List <Conta> lista = new ArrayList <Conta>();
		
		ContaCorrente cc1 = new ContaCorrente(11, 22);
		lista.add(cc1);

		ContaPoupanca cc2 = new ContaPoupanca(12, 33);
		lista.add(cc2);

		System.out.println("tamanho" + lista.size());

		Conta ref = lista.get(0);
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
				
		
		for (Conta contas : lista) { // FOR NOVO // EXPLICANDO O FOR NOVO, PARA CADA ELEMENTO OBJECT ENCIAM DA LISTA FAZ{ System.out.println(o)}
			System.out.println(contas);
		}

	}

}
