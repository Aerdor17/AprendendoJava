
public class TestaGerente {
	
	public static void main(String[] args) {
		Gerente marco = new Gerente(); // CRIEI O GERENTE
		marco.setNome("Marco");			// POPULEI OS DADOS NOME, CPF, SALARIO
		marco.setCpf("222333444-5");
		marco.setSalario(5000.0);
		
		System.out.println(marco.getNome());
		System.out.println(marco.getCpf());
		System.out.println(marco.getSalario());
		
		marco.setSenha(2222);	// DEFINI UMA SENHA PARA O GERENTE
		
		boolean autenticou = marco.autentica(2222); // CHAMEI O METODO AUTENTICA, PASSEI A SENHA E GUARDEI O RETORNO TRUE OU FALSE DENTRO DA VARIAVEL BOOLEAN AUTENTICOU
		System.out.println(autenticou);
		
		System.out.println(marco.getBonificacao());
		
//		teste Com funcionario
//		Funcionario paulo = new Funcionario();
//		paulo.setNome("Paulo");
//		paulo.setCpf("333444555-6");
//		paulo.setSalario(2000.0);
//		
//		System.out.println(paulo.getNome());
//		System.out.println(paulo.getCpf());
//		System.out.println(paulo.getSalario());
//		System.out.println(paulo.getBonificacao());
		
	}
}
