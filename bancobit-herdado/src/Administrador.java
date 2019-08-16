
public class Administrador extends Funcionario implements Autenticavel {

	private Autenticador autentica;

	@Override
	public double getBonificacao() {

		return 50;
	}

	public Administrador() {
		this.autentica = new Autenticador();
	}

	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autentica.autentica(senha);
	}

}
