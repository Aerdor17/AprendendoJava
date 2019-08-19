
public class Administrador extends Funcionario implements Autenticavel {

	private AutenticadorUtil autenticador;

	@Override
	public double getBonificacao() {

		return 50;
	}

	public Administrador() { // CONSTRUTOR É GERADO NAS CLASSES QUE PRECISAM IMPLEMENTAR UMA AUTENTICAÇÃO PARA INSTANCIAR UM OBJETO DO TIPO "AutenticadorUtil();"
		this.autenticador = new AutenticadorUtil();
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha);
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha);
	}

}
