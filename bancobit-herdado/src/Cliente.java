
public class Cliente implements Autenticavel {

	private AutenticadorUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticadorUtil(); // CONSTRUTOR É GERADO NAS CLASSES QUE PRECISAM IMPLEMENTAR UMA AUTENTICAÇÃO PARA INSTANCIAR UM OBJETO DO TIPO "AutenticadorUtil();"
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); // DELEGO A CHAMADA DO METODO PARA O AUTENTICADOR UTIL
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); // DELEGO A CHAMADA DO METODO PARA O AUTENTICADOR UTIL
	}

}
