// GERETE EH UM FUNCIONÁRIO, OU O GERTENTE HERDA DA CLASS FUNCIONARIO SEUS ATRIBUTOS E FUNÇÕES 
public class Gerente extends Funcionario { // EXTENDS FAZ UMA CLASSE HERADAR A OUTRA

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

	public double getBonificacao() {
		return super.getSalario();

	}
}
