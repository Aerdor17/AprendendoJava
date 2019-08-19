
public class ContasNu {

	protected double saldo;
	private int agencia;
	private int numero;

	public ContasNu(int agencia, int numero) {
		this.agencia = agencia;
		this.numero = numero;
	}

	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("saldo insuficiente");
			return false;
		}
	}

	public void deposita(double valor) {
		this.saldo = this.saldo += valor;
	}

	public boolean transfere(double valor, ContasNu destino) {
		if (saldo >= valor) {
			this.saca(valor);
			destino.deposita(valor);
			return true;
		} else {
			return false;
		}
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getAgencia() {
		return agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

}
