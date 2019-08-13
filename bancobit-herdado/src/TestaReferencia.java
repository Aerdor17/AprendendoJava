
public class TestaReferencia {

	public static void main(String[] args) {

		Gerente marcos = new Gerente();
		// OU
		//Funcionario marcos = new Gerente(); TAMBEM FUNCIONA POREM ALGUNS METODOS QUE GETENTE POSSUEM NÃO IRÃO COMPILAR, POIS NEM TODO FUNCIONARIO É DO TIPO GERENTE
		// POLIMORFISMO É NADA MAIS DE QUE UM OBJETO QUE POSSA SER REVERENCIADO DE UMA REFERENCIA DO MESMO TIPO OU UMA REFERENCIA MAIS GENERICA
		// OU SEJA SE EU TENHO UM OBJETO DO TIPO GERENTE EU POSSO TER UMA REFERENCIA DO TIPO GERENTE OU UMA REFERENCIA DO TIPO FUNCIONARIO
		marcos.setNome("marcos");
		String nome = marcos.getNome();		
		//marcos.autentica(2222);// FUNCIONA
		//paulo.autentica(2222); NÃO COMPILA POIS NEM TODO FUNCIONARIO É GERENTE
		System.out.println(nome);

	}

}
