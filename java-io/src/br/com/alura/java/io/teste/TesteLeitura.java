package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

public class TesteLeitura {
	
	public static void main(String[] args) throws IOException {
		
		//Fluxo de entrada com Arquivo
		FileInputStream fis = new FileInputStream("lorem.txt"); // criando um fluxo concreto com dados bin�rios
		InputStreamReader isr = new InputStreamReader(fis); // melhorando os dados bin�rios transformandoos em caracteres
		BufferedReader br = new BufferedReader(isr); // juntando os caractertes em linhas
		
		String linha = br.readLine(); // l� uma linha
		System.out.println(linha);
		
		br.close();
		
	}

}
