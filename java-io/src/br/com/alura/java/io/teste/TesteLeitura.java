package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

public class TesteLeitura {

	public static void main(String[] args) throws IOException {

		// Fluxo de entrada com Arquivo
		InputStream fis = new FileInputStream("lorem.txt"); // criando um fluxo concreto com dados binários
		Reader isr = new InputStreamReader(fis); // melhorando os dados binários transformandoos em caracteres
		BufferedReader br = new BufferedReader(isr); // juntando os caractertes em linhas

		String linha = br.readLine(); // lé uma linha

		while (linha != null) {
			System.out.println(linha);
			linha = br.readLine();
		}

		br.close();

	}

}
