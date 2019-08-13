
public class TestaReferencia {

	public static void main(String[] args) {

		Gerente g1 = new Gerente();
		g1.setNome("Marcos");
		g1.setSalario(5000.0);
			
		Funcionario ev = new EditorVideo();
		ev.setSalario(2000.0);
		
		Funcionario ux = new Designer();
		ux.setSalario(2000.0);
		
		ControleBonificacao controle = new ControleBonificacao();
		controle.registra(g1);
		controle.registra(ev);
		controle.registra(ux);
		
		System.out.println(controle.getSomabonifica());

	}

}
