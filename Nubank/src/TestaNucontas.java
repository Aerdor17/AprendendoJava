
public class TestaNucontas {
	
	public static void main(String[] args) {
		
		
		NuConta nu = new NuConta(222, 333);
		nu.deposita(100.0);		
		
		NuContaPoupanca ncp = new NuContaPoupanca(221,331);
		
		nu.transfere(50.0, ncp);
		
		System.out.println(ncp.getSaldo());
	}

}
