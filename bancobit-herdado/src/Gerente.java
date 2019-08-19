
public class Gerente extends Funcionario implements Autenticavel {
	
	private AutenticadorUtil autenticador;

	public Gerente() { // CONSTRUTOR É GERADO NAS CLASSES QUE PRECISAM IMPLEMENTAR UMA AUTENTICAÇÃO PARA INSTANCIAR UM OBJETO DO TIPO "AutenticadorUtil();"
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
