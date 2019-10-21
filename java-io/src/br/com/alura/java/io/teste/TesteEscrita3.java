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
import java.io.Reader;
import java.io.Writer;

public class TesteEscrita3 {

	public static void main(String[] args) throws IOException {

			// Fluxo de entrada com Arquivo
		// BufferedWriter fw = new BufferedWriter(new FileWriter("lorem2.txt"));			
		
		fw.write("Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod");		
		fw.newLine();
		fw.newLine();
		//	fw.write(System.lineSeparator()); // nova linha bonito		
		//	fw.write("\r\n"); // nova linha feio
		fw.write("mais uma linha");
		fw.close();

	}

}
