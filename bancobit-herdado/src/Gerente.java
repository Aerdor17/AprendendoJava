// GERETE EH UM FUNCION�RIO, OU O GERTENTE HERDA DA CLASS FUNCIONARIO SEUS ATRIBUTOS E FUN��ES 
public class Gerente extends FuncionarioAutenticavel { // EXTENDS FAZ UMA CLASSE HERADAR A OUTRA

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setSenha(2222);
	}

	@Override
	public double getBonificacao() {
		return 100;
	}

}
