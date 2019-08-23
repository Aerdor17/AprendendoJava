public class FluxoComError {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {// TRATAMENTO DE EXCEPTIONS
			metodo1();
		} catch (ArithmeticException | NullPointerException ex) { // UM CATCH PARA DUAS EXCEPTIONS
			String msg = ex.getMessage(); // PEGANDO A MENSAGEM DA EXCEPTION
			System.out.println("Exception " + msg);
			ex.printStackTrace(); // PEGANDO O RASTRO DA EXCEPTION
		}
		System.out.println("Fim do main");
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {// VAI CAUSAR UM StackOverflowError ESSE ERRO ACONTECE QUANDO A PILHA FICA SEM
									// ESPAÇO
		System.out.println("ini metodo 2 ");
		metodo2();
	}

}
