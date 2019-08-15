
// NAO PODEM MAIS INSTANCIAR ESSA CLASS POIS ELA AGORA É ABSTRATA
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// METODO ABSTRATO ELE NÃO TEM UM CORPO // SE VOCÊ COLOCAR UM METODO ABSTRATO EM
	// UMA CLASS MAE VOCE OBRIGA OS FILHOS A IMPLEMENTAREM ELE
	public abstract double getBonificacao();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
