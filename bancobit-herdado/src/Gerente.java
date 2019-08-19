
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil autenticador;

	public Gerente() { // CONSTRUTOR
		this.autenticador = new AutenticadorUtil();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
