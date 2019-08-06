

public class TestaValoresBit {

	public static void main(String[] args) {

		ContaBit contabit = new ContaBit(1337, 24226);

		// A CONTA ESTA INCONSISTENTE / DEPOIS DE CRIADO O CONSTRUTOR ESSE TREXO DE
		// CÓDIGO
		// PARA DE COMPILAR
		//contabit.setAgencia(-50);
		//contabit.setNumero(-330);

		System.out.println(contabit.getAgencia());

		ContaBit contabit2 = new ContaBit(1337, 24326);
		ContaBit contabit3 = new ContaBit(1337, 24426);
		ContaBit contabit4 = new ContaBit(1337, 24526);
		
		System.out.println(ContaBit.getTotal()); // É ASSIM QUE INVOCA O CONTADOR DO TOTAL DE NEW CONTAS DADOS

	}
}
