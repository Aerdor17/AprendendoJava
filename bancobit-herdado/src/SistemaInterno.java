
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticou = fa.autentica(senha);
		if (autenticou) {
			System.out.println("pode entrar no sitema");
		} else {
			System.out.println("não pode entrar no sistema");
		}

	}

}
