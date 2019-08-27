
public class SaldoInsuficienteException extends Exception{
	
	public SaldoInsuficienteException(String msg) {
		super(msg);
	}
	
//	@Override
//	public void saca(double valor) throws SaldoInsuficienteException {  
//		double valorSaca = valor + 0.20;
//		super.saca(valorSaca); 
//	QUANDO EU extends direto da classe Exception e não de RuntimeException eu obrigo todoas as classes que implemente o metodo saldo insuficinte a deixarem
//	explicito na assinatura do metodo throws SaldoInsuficienteException 

}
