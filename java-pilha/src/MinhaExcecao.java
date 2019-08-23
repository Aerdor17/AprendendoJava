
public class MinhaExcecao extends Exception {
//public class MinhaExcecao extends Exception {	 QUANDO EU EXTENDO "Exception" O COMPILADOR FAZ UMA CHECAGEM NO METODO, EXIGINDO QUE O METODO ASSINE  throws MinhaExcecao
	public MinhaExcecao(String msg) {
		super(msg);
	}

}
