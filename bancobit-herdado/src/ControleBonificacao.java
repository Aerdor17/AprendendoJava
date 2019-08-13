
public class ControleBonificacao {

	private double somabonifica;

	public void bonificacao(Funcionario f) {
		double bonifica = f.getBonificacao();
		this.somabonifica = this.somabonifica + bonifica;
	}

	public double getSomabonifica() {
		return somabonifica;
	}

}
