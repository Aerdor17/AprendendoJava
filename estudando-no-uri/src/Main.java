import java.io.IOException;
import java.util.Scanner;
// LINK PARA ENTENDER MELHOR OS TIPOS DE System.out.print(); https://www.devmedia.com.br/system-out-objeto-de-saida-em-java/25240
public class Main {
	// area do circulo
	public static void main(String[] args) throws IOException {

		Scanner var = new Scanner(System.in); // le varivaeis

		double raio = var.nextDouble(); // tipo da variavel a ser lida 
		double n1 = 3.14159 * Math.pow(raio, 2); // match.pow é um metodo para elevar a base ao espoente nesse caso o raio é a base

		System.out.printf("A=%.4f" , n1); // define quantas casas apos a vircula devem ser mostradas "%.4f" OU "%.4f%n"
		var.close(); // fecha o programa
		
//		%d	representa números inteiros
//		%f	representa números floats
//		%2f	representa números doubles
//		%b	representa valores booleanos
//		%c	representa valores char

	}

}
