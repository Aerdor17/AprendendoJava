
public class AutenticadorUtil { // CLASSE DE COMPOSIÇÃO ELA RECEBE AS TAREFAZ DOS OUTROS METODOS
								// AGORA TODA A LÓGICA DE AUTENTICAÇÃO FICA EM UM LUGAR SÓfs
	private int senha;

	public void setSenha(int senha) {
		this.senha = senha;

	}

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			return false;
		}

	}

}
