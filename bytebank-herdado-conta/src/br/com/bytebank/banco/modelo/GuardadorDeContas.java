package br.com.bytebank.banco.modelo;

public class GuardadorDeContas {
	
	private Object[] referencias;
	private int posicaoLivre;
	
	public GuardadorDeContas() {
		this.referencias = new Object[10];
		this.posicaoLivre = 0;
	}
	
	public void adiciona(Object ref) { // Construtor
		this.referencias[this.posicaoLivre] = ref; // guardo a quantidade de posi��o livres no array
		this.posicaoLivre++;
	}

	public int getQuantidadeDeElementos() {
		return this.posicaoLivre; // retorno a quantidade de elementos
	}

	public Object getReferencia(int pos) {
		return this.referencias[pos];
	}

}
