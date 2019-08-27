
public class TesteConexao {

	public static void main(String[] args) {

		try (Conexao con = new Conexao()) {
			con.leDados();
		} catch (IllegalStateException ex) {
			System.out.println("deu erro na conexao...");
		}

		// -------------------------------------------------
		// modo antigo de tratar a conexao depois do java 1.7 o metodo utilizado mudou
		// para o que sta acima

//		Conexao con = null;
//		try {
//			con = new Conexao();
//			con.leDados();
//		} catch (IllegalStateException ex) {
//			System.out.println("deu erro na conexao...");
//		} finally {
//			con.fecha();
//		}
//		// try sem catch sem a captura da exception
//		try {
//			con = new Conexao();
//			con.leDados();
//		} finally {
//			if (con != null) { // o if evita um null poiner exception no caso do erro acontecer antes da conexão ser inicializada
//				con.fecha();
//			}
//
//		}
	}

}
