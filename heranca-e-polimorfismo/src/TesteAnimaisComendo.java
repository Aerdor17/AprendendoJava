
public class TesteAnimaisComendo {
	
	public void FazerAnimaisComer(Animal animal) {
		animal.Comer();
		
	}
	
	public static void main(String[] args) {
		TesteAnimaisComendo t = new TesteAnimaisComendo();
		t.FazerAnimaisComer(new Animal());
		t.FazerAnimaisComer(new Gato());
		t.FazerAnimaisComer(new Cao());		
		t.FazerAnimaisComer(new Papagaio());
		t.FazerAnimaisComer(new Urso());
		t.FazerAnimaisComer(new Tigre());
		
		//O POLIMORFISMO NADA MAIS É DO QUE A CAPACIDADE DE UMA CLASSE DO TIPO GENERICA REFERENCIAR OUTRA DE UM TIPO MAIS EXPECIFICO
		
	}
	
}
