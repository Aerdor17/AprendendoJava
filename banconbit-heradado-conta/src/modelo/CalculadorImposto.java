package modelo;
// FQN = full qualifield name
//modelo.CalculadorImposto = FQN
public class CalculadorImposto {

	private double TotalImposto;

	public void registra(Tributavel t) {
		double valor = t.getValorImposto();
		this.TotalImposto = this.TotalImposto += valor;
	}
	
	public double getTotalimposto() {
		return TotalImposto;
	}
	

}
