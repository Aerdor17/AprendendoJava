//CONTRATO AUTENTICAVEL
    //QUEM ASSINAR ESSE CONTRATO PRECISA IMPLEMENTAR("implements")
            //METODO (setSenha)
            //METODO (autentica)
				//UMA INTERFACE � UMA CLASSE ABSTRATA COM TODOS OS METODOS ABSTRATOS
public abstract interface Autenticavel { 

	public abstract void setSenha(int senha);

	public abstract boolean autentica(int senha);

}
