package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Conta[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Conta[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Conta ref) { // Construtor
		this.referencias[this.posicaoLivre] = ref; // guardo a quantidade de posição livres no array
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre; // retorno a quantidade de elementos
	}

	public Conta getReferencia(int pos) {
		return this.referencias[pos];
	}

}
