
public class AutenticadorUtil { // CLASSE DE COMPOSIÇÃO ELA RECEBE AS TAREFAZ DO "setSenha e autentica" das classes que precisam implementalas

	private int senha;
	
	public void setSenha(int senha) {
		this.senha = senha;

	}
	
	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		}else {
			return false;
		}
		
	}

}
