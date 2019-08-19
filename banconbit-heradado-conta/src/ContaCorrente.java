
public class ContaCorrente extends Conta implements Tributavel {

	public ContaCorrente(int agencia, int numero) { // E ASSIM QUE EU CHAMO UM CONSTRUTOR ESPECIFICO DA SUPERCLASS PARA
													// A CLASS FILHA
		super(agencia, numero);
	}

	@Override
	public boolean saca(double valor) { // GAMBI
		double valorSaca = valor + 0.20;
		return super.saca(valorSaca);
	}

	@Override
	public void deposita(double valor) {
		this.saldo += valor;

	}

	@Override
	public double getValorImposto() {
		return super.saldo * 0.01;
	}

}
