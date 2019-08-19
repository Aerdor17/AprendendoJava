
public class Cliente implements Autenticavel {

	private AutenticadorUtil autenticador;

	public Cliente() {
		this.autenticador = new AutenticadorUtil(); // INSTANCIO O AUTENTICADOR UTIL
	}

	public void setSenha(int senha) {
		this.autenticador.setSenha(senha); // DELEGO A CHAMADA DO METODO PARA O AUTENTICADOR UTIL
	}

	public boolean autentica(int senha) {
		return this.autenticador.autentica(senha); // DELEGO A CHAMADA DO METODO PARA O AUTENTICADOR UTIL
	}

}
