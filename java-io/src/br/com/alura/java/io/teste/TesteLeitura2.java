package br.com.alura.java.io.teste;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

public class TesteLeitura2 {

	public static void main(String[] args) throws Exception {

		Scanner scanner = new Scanner(new File("contas.csv"));

		while (scanner.hasNextLine()) { // enquanto ouver uma proxima linha faça {...}
			String linha = scanner.nextLine(); // scanner.nextLine() pego a proxima linha jogo dentro da variavel linha
												// e imprimo em seguida
			System.out.println(linha);

			Scanner linhaScanner = new Scanner(linha);
			linhaScanner.useLocale(Locale.US); // pede para o delimitador sempre usar as regras de separação de inteiros
												// para decimais americanas ou seja o ponto "." e não a virgula ","
			linhaScanner.useDelimiter(","); // define o parsing

			String valor1 = linhaScanner.next(); // .next le o proximo arquivo e já faz o parsing
			int valor2 = linhaScanner.nextInt();
			int valor3 = linhaScanner.nextInt();
			String valor4 = linhaScanner.next();
			double valor5 = linhaScanner.nextDouble();
			
			
			String valorFormatato = String.format(" %s %s %s %s %s " , valor1 ,valor2, valor3, valor4, valor5);
			System.out.println(valorFormatato);

			linhaScanner.close();

			// String[] valores = linha.split(",");
			// System.out.println(valores[3]);

		}
		scanner.close();

	}

}
