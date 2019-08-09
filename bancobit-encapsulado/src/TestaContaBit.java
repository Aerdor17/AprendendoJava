
public class TestaContaBit {
	
	public static void main(String[] args) {
		
		ContaBit contabit = new ContaBit(1337,12345);
		
		contabit.deposita(200.0);
		
		System.out.println(contabit.getSaldo());
		
		contabit.setAgencia(570);
		
		System.out.println(contabit.getAgencia());
		
		System.out.println("o total de contas é :"+ ContaBit.getTotal());
		
		
	}

}
