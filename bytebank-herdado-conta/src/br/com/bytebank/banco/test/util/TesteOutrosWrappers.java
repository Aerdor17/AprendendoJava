package br.com.bytebank.banco.test.util;

import java.util.ArrayList;
import java.util.List;

public class TesteOutrosWrappers {

	public static void main(String[] args) {
		
		
		Integer idadeRef = Integer.valueOf(29); // autoboxing
		System.out.println(idadeRef.intValue()); // unboxing
		
		Double dRef = Double.valueOf(3.2);// autoboxing do double				
		System.out.println(dRef.doubleValue());// unboxing do double
		
		Boolean bRef = Boolean.FALSE;// autoboxing de um boolean
		System.out.println(bRef.booleanValue());// unboxing de um boolean
		
		// TODOS OS TIPOS PRIMITIVOS EXTENDS DA CLASS MÃE DELES A CLASS "Number" LOGO EU POSSO FAZER:
		// referencia mais genérica "Number" para referenciar tipos mais expecificos
		Number refNumeroInt = Integer.valueOf(29);
		Number refNumeroDouble = Double.valueOf(3.2);
		
		List<Number> lista = new ArrayList(); // List do tipo "Number" que armazena todos os primitivos
		lista.add(10);
		lista.add(3.2);
		lista.add(25.6f);
		

	}

}
