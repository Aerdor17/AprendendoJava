
public class ContaBit { // 0.6 Construtores e membros estáticos, 02. utilizando construtores
	private double saldo;
	private int agencia;
	private int numero;
	private ClienteBit titular;
	private static int total; // MOSTRA O TOTAL DE CONTAS CRIADAS / static É PARA DIZER QUE O ATRIBUTO É DA CLASSE CONTABIT DISPENSANDO ASSIM O OBJETO DO LADO ESQUEDO NA INVOCAÇÃO DO METODO GET

	// ESSE CONSTRUTOR OBRIGA VOCÊ A PASSAR AGENCIA E NUMERO QUANDO VOCÊ DA NEW EM
	// UMA CONTA
	public ContaBit(int agencia, int numero) { // CONSTRUTOR
		total++; // OU CONTABIT.TOTAL
		//System.out.println("o total de contas é " + total);
		
		this.agencia = agencia;
		this.numero = numero;
		//System.out.println("estou criando uma nova conta " + this.numero);

	}

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
			System.out.println("você não tem saldo suficiente");
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
			System.out.println("numero não pode ser menor ou igual a zero");
			return;
		}
		this.numero = numero;
	}

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		if (agencia <= 0) {
			System.out.println("não pode valor menor ou igual a zero");
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
	
	public static int getTotal() { //METODOS STATIC ACESSAM SÓ ATRIBUTOS STATIC DENTRO DA CLASSE, NÃO ACESSÃO ATRIBUTOS DE INSTANCIA
		return ContaBit.total; //OU SÓ TOTAL
	}
}
