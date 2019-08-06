
public class TestaGetESetBit {

	public static void main(String[] args) {
		ContaBit contabit = new ContaBit(1337,24226);
		// conta.numero = 1337; n�o compila mais porque agora o que vale � o
		// setNumero/getNumero
		//contabit.setNumero(1337); j� passei no construtor encima
		System.out.println(contabit.getNumero());

		ClienteBit paulo = new ClienteBit();
		// conta.titular = paulo; n�o compila mais porque agora titular tem get and set

		paulo.setNome("paulo silveira");
		// paulo � a variavel do ClienteBit paulo = new ClienteBit(); que nos guardamos

		contabit.setTitular(paulo);
		System.out.println(contabit.getTitular().getNome());

		contabit.getTitular().setNome("programador");
		// agora em duas linhas
		ClienteBit titularDaConta = contabit.getTitular();
		titularDaConta.setProfissao("programador");

		System.out.println(titularDaConta);
		System.out.println(paulo);
		System.out.println(contabit.getTitular());

	}

}
