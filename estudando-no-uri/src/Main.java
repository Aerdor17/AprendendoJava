import java.io.IOException;
import java.util.Scanner;

public class Main {
	// area do circulo
	public static void main(String[] args) throws IOException {

		Scanner var = new Scanner(System.in); // le varivaeis

		double raio = var.nextDouble(); // tipo da variavel a ser lida 
		double n1 = 3.14159 * Math.pow(raio, 2);

		System.out.printf("A=%.4f%n" , n1); // define quantas casas apos a vircula devem ser mostradas
		var.close(); // fecha o programa

	}

}
