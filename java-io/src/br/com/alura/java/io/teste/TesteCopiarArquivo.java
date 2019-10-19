package br.com.alura.java.io.teste;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Writer;
import java.net.Socket;

public class TesteCopiarArquivo {

	public static void main(String[] args) throws IOException { // copiando do lorem para o lorem2

		
		Socket s = new Socket();
		
		// leitura			//rede				// teclado	  // arquivo	
		InputStream fis = s.getInputStream(); // System.in; // new FileOutputStream("lorem2.txt");
		InputStream fis2 = new FileInputStream("lorem.txt");  
		Reader isr = new InputStreamReader(fis); 
		BufferedReader br = new BufferedReader(isr); 
		
		// escrita			//rede				// teclado	  // arquivo						
		OutputStream fos = s.getOutputStream(); //System.out; // new FileOutputStream("lorem2.txt"); 
		Writer osw = new OutputStreamWriter(fos); 
		BufferedWriter bw = new BufferedWriter(osw); 
		

		String linha = br.readLine(); 
		while (linha != null && linha.isEmpty()) {
			bw.write(linha);
			bw.newLine();
			bw.flush(); // limpa as linhas em branco
			linha = br.readLine();
		}

		br.close();
		bw.close();
		

	}

}
