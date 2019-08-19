
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticadorUtil autenticador;

	@Override
	public double getBonificacao() {

		return 50;
	}

	public Administrador() { // CONSTRUTOR
		this.autenticador = new AutenticadorUtil();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
