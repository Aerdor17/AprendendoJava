public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {// TRATAMENTO DE EXCEPTIONS
			metodo1();
		} catch (ArithmeticException | NullPointerException | MinhaExcecao ex) { // UM CATCH PARA DUAS EXCEPTIONS
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

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		// CRIO UM OBJETO COM NEW E DO LADO ESQUERDO EU FAÇO O "throw" JOGAR ELA COMO
		// UMA BOMBA NO "metodo2();
		throw new MinhaExcecao("deu errado");

		// DEPOIS DA EXCEPTION O CODIGO NÃO PASSA MAIS A SER EXECUTADO
		// POR ISSO FOI COMENTADO A LINHA: System.out.println("Fim do metodo2");

	}

}
