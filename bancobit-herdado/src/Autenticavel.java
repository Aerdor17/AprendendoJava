//CONTRATO AUTENTICAVEL
    //QUEM ASSINAR ESSE CONTRATO PRECISA IMPLEMENTAR("implements")
            //METODO (setSenha)
            //METODO (autenticavel)
				//UMA INTERFACE É UMA CLASSE ABSTRATA COM TODOS OS METODOS ABSTRATOS, RESOLVE O PROBLEMA DA POLIMORFIA
					// COM A CRIAÇÃO DO "AutenticadorUtil"  ESSA CLASS NÃO É MAIS USADA
public abstract interface Autenticavel { 

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
