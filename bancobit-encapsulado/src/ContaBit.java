
public class ContaBit { // JAVA PARTE 3, AULA 02
	private double saldo;
	private int agencia;
	private int numero;
	private ClienteBit titular;
	private static int total; // MOSTRA O TOTAL DE CONTAS CRIADAS / static � PARA DIZER QUE O ATRIBUTO � DA CLASSE CONTABIT DISPENSANDO ASSIM O OBJETO DO LADO ESQUEDO NA INVOCA��O DO METODO GET

	// ESSE CONSTRUTOR OBRIGA VOC� A PASSAR AGENCIA E NUMERO QUANDO VOC� DA NEW EM
	// UMA CONTA
	public ContaBit(int agencia, int numero) { // CONSTRUTOR
		total++; // OU CONTABIT.TOTAL
		//System.out.println("o total de contas � " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma nova conta " + this.numero);

	}
	// teste
	public void deposita(double valor) {

		this.saldo = this.saldo += valor;

	}

	public boolean saca(double valor) {

		if (this.saldo >= valor) {
			this.saldo = this.saldo -= valor;
			return true;
		} else {
			System.out.println("saldo insuficiente");
			return false;
		}

	}

	public boolean transfere(double valor, ContaBit destino) {
		if (this.saldo >= valor) {
			this.saldo -= valor; // THIS.SALDO = SALDO -= VALOR ;
			destino.deposita(valor);
			return true;
		} else {
			System.out.println("voc� n�o tem saldo suficiente");
			return false;
		}
	}

	public double getSaldo() {
		return this.saldo;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		if (numero <= 0) {
			System.out.println("numero n�o pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("n�o pode valor menor ou igual a zero");
			return;
		}
		this.agencia = agencia;
	}

	public ClienteBit getTitular() {
		return titular;
	}

	public void setTitular(ClienteBit titular) {
		this.titular = titular;
	}
	
	public static int getTotal() { //METODOS STATIC ACESSAM S� ATRIBUTOS STATIC DENTRO DA CLASSE, N�O ACESS�O ATRIBUTOS DE INSTANCIA
		return ContaBit.total; //OU S� TOTAL
	}
}
