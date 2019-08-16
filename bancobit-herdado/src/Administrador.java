
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticadorUtil autentica;

	@Override
	public double getBonificacao() {

		return 50;
	}

	public Administrador() { // CONSTRUTOR
		this.autentica = new AutenticadorUtil();
	}

	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autentica.autentica(senha);
	}

}
