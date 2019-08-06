
public class TestaGetESetBit {

	public static void main(String[] args) {
		ContaBit contabit = new ContaBit(1337,24226);
		// conta.numero = 1337; não compila mais porque agora o que vale é o
		// setNumero/getNumero
		//contabit.setNumero(1337); já passei no construtor encima
		System.out.println(contabit.getNumero());

		ClienteBit paulo = new ClienteBit();
		// conta.titular = paulo; não compila mais porque agora titular tem get and set

		paulo.setNome("paulo silveira");
		// paulo é a variavel do ClienteBit paulo = new ClienteBit(); que nos guardamos

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
