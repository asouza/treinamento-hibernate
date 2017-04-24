package br.com.caelum.pmc.treinamentohibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaUpdateEntityCache {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("treinamento");
		EntityManager em = factory.createEntityManager();
		
		Categoria categoria = em.find(Categoria.class, 1);
		System.out.println(categoria.getNome());
		
		em.close();
		
		EntityManager em2 = factory.createEntityManager();
		em2.getTransaction().begin();
		
		Categoria categoriaCacheada = em2.find(Categoria.class, 1);
		categoriaCacheada.setNome("mobile");
		
		em2.getTransaction().commit();
		em2.close();
		
		EntityManager em3 = factory.createEntityManager();
		
		Categoria categoriaCacheada2 = em3.find(Categoria.class, 1);
		System.out.println(categoriaCacheada2.getNome());
		
		em3.close();		
		factory.close();
	}
}
