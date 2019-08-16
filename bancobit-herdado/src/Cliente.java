
public class Cliente implements Autenticavel {

	private Autenticador autentica;

	public Cliente() {
		this.autentica = new Autenticador();
	}

	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autentica.autentica(senha);
	}

}
