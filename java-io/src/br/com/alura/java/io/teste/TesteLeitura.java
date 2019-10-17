package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt"); // criando um fluxo concreto com dados binários
		InputStreamReader isr = new InputStreamReader(fis); // melhorando os dados binários transformandoos em caracteres
		BufferedReader br = new BufferedReader(isr); // juntando os caractertes em linhas
		
		String linha = br.readLine(); // lé uma linha
		System.out.println(linha);
		
		br.close();
		
	}

}
