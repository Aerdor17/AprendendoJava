package br.com.bytebank.banco.test;

public class TesteString {
	
	public static void main(String[] args) {
		
		String nome = "alura"; // object literal
		//String outro = new String ("alura"); // má pratica 
		
		//String outra = nome.replace("A", "a"); // muda o A para a
		
		String outra = nome.toLowerCase();
		//String outra = nome.toUpperCase();
				
		System.out.println(outra);
		
	}
}
