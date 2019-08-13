
public class Designer extends Funcionario {
	
	public double getBonificacao() {
		System.out.println("Chamando o metodo bonificacao Desinger");
		return super.getBonificacao() + 200;
	}

}
