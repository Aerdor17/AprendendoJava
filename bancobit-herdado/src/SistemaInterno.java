
public class SistemaInterno {
	
	private int senha = 2222;
	
	public void autentica(Gerente g) {
		boolean autenticou = g.autentica(senha);
		if(autenticou) {
			System.out.println("pode entrar no sitema");
		}else {
			System.out.println("n�o pdoe entrar no sistema");
		}
		
		
	}
	
}
