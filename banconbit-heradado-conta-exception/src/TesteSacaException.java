
public class TesteSacaException {
	public static void main(String[] args) {
		
		ContaCorrente c = new ContaCorrente(123, 321); 
		
		c.deposita(200.0);
		try {
			c.saca(100.0); 	// SE O VALOR SACADO FOI MAIOR QUE O SALDO A BOMBA EXPLODE E UMA EXCEPTION EH LANCADA
		}catch( SaldoInsuficienteException ex) {
			System.out.println("ex: "+ ex.getMessage());
		}
		
		
		System.out.println(c.getSaldo());
	}

}
