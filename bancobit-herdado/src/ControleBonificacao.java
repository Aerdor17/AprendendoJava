
public class ControleBonificacao {

	private double somabonifica;

	public void registra(Funcionario f) { // TODOS USAM O METODO BONIFICA POREM CADA UM RECEBE UMA BONIFICACAO DIFERENTE
		double bonifica = f.getBonificacao();
		this.somabonifica += bonifica;
	}

	public double getSomabonifica() {
		return this.somabonifica;
	}

}
