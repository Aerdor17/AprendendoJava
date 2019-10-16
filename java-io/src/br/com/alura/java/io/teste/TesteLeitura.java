package br.com.alura.java.io.teste;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;

public class TesteLeitura {
	
	public static void main(String[] args) throws FileNotFoundException {
		
		//Fluxo de entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt");// estabelecia a entrada de um arquivo com o inputStream
		InputStreamReader isr = new InputStreamReader(fis); // InputStreamReader sabe ler os bits do arquivo e transformar em character
		
		
	}

}
