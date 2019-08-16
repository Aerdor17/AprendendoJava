
public class Gerente extends Funcionario implements Autenticavel {
	private Autenticador autentica;

	public Gerente() {
		this.autentica = new Autenticador();
	}

	@Override
	public double getBonificacao() {
		return super.getSalario();
	}

	public void setSenha(int senha) {
		this.autentica.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autentica.autentica(senha);
	}

}
