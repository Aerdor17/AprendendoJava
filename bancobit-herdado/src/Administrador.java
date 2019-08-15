
public class Administrador extends FuncionarioAutenticavel {

	public static void main(String[] args) {
		Administrador adm = new Administrador();
		adm.setSenha(2322);
	}

	@Override
	public double getBonificacao() {
		return 50;
	}

}
