public class Fluxo {

	public static void main(String[] args) {
		System.out.println("Ini do main");
		try {// TRATAMENTO DE EXCEPTIONS
			metodo1();
			System.out.println("Fim do main");
		} catch (ArithmeticException | NullPointerException ex) { // UM CATCH PARA DUAS EXCEPTIONS
			String msg = ex.getMessage(); //PEGANDO A MENSAGEM DA EXCEPTION
			System.out.println("ArithmeticException" + msg);
			ex.printStackTrace(); // PEGANDO O RASTRO DA EXCEPTION
		}
	}

	private static void metodo1() {
		System.out.println("Ini do metodo1");
		metodo2();
		System.out.println("Fim do metodo1");

	}

	private static void metodo2() {
		System.out.println("Ini do metodo2");
		for (int i = 1; i <= 5; i++) {
			System.out.println(i);
			//int a = i / 0;
			Conta c = null;
			c.deposita();
		}
		System.out.println("Fim do metodo2");
	}

}
