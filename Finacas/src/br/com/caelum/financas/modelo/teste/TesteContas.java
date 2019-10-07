package br.com.caelum.financas.modelo.teste;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import br.com.caelum.financas.modelo.Conta;

public class TesteContas {
	
	public static void main(String[] args) {
		
		Conta conta = new Conta();
		conta.setBanco("caixa economica");
		conta.setTitular("Leonardo");
		conta.setAgencia("123");		
		conta.setNumero("456");
		conta.setId(222);
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("financas");
		EntityManager em = emf.createEntityManager();
		
		em.getTransaction().begin();
		em.persist(conta);
		em.getTransaction().commit();
		
		em.close();
		emf.close();
		
		
		

	}

}
