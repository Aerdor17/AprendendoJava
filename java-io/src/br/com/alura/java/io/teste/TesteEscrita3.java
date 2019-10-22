package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

			// Fluxo de entrada com Arquivo
			// BufferedWriter fw = new BufferedWriter(new FileWriter("lorem2.txt"));	
			// OutputStream fos = new FileOutputStream("lorem2.txt"); // criando um fluxo concreto com dados binários
			// Writer osw = new OutputStreamWriter(fos); // melhorando os dados binários transformandoos em caracteres
			// BufferedWriter bw = new BufferedWriter(osw); // juntando os caractertes em linhas		
			// bw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");
		
		PrintStream ps = new PrintStream("lorem2.txt");
		
		ps.println("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");		
		ps.println();
		ps.println("mais uma linha");
		ps.println(System.currentTimeMillis()); // devolve os milissegundos que passaram desde 1 de janeiro de 1970
		
		ps.close();
		
	}

}
