
public class AutenticadorUtil { // CLASSE DE COMPOSI��O ELA RECEBE AS TAREFAZ DOS OUTROS METODOS
								// AGORA TODA A L�GICA DE AUTENTICA��O FICA EM UM LUGAR S�fs
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
