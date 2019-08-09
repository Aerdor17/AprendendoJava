// Gerente eh um funcionario, Gerente herda da class 
public class Gerente extends Funcionario {

	private int senha;
	
	

	public boolean autentica(int senha) {
		if (this.senha == senha) {
			return true;
		} else {
			System.out.println("Senha incorreta");
			return false;
		}
	}
	
	public void setSenha(int senha) {
		this.senha = senha;
	}

	/*
	 * public double getBonificacao() { return this.salario;
	 * 
	 * }
	 */

}
