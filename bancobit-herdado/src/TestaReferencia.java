
public class TestaReferencia {

	public static void main(String[] args) {

		Gerente marcos = new Gerente();
		// OU
		//Funcionario marcos = new Gerente(); TAMBEM FUNCIONA POREM ALGUNS METODOS QUE GETENTE POSSUEM N�O IR�O COMPILAR, POIS NEM TODO FUNCIONARIO � DO TIPO GERENTE
		// POLIMORFISMO � NADA MAIS DE QUE UM OBJETO QUE POSSA SER REVERENCIADO DE UMA REFERENCIA DO MESMO TIPO OU UMA REFERENCIA MAIS GENERICA
		// OU SEJA SE EU TENHO UM OBJETO DO TIPO GERENTE EU POSSO TER UMA REFERENCIA DO TIPO GERENTE OU UMA REFERENCIA DO TIPO FUNCIONARIO
		marcos.setNome("marcos");
		String nome = marcos.getNome();		
		//marcos.autentica(2222);// FUNCIONA
		//paulo.autentica(2222); N�O COMPILA POIS NEM TODO FUNCIONARIO � GERENTE
		System.out.println(nome);

	}

}
