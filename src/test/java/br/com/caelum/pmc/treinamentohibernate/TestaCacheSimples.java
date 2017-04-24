package br.com.caelum.pmc.treinamentohibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class TestaCacheSimples {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("treinamento");
		EntityManager em = factory.createEntityManager();
		
		Categoria categoria = em.find(Categoria.class, 1);
		System.out.println(categoria.getNome());
		
		em.close();
		
		EntityManager em2 = factory.createEntityManager();
		
		Categoria categoriaCacheada = em2.find(Categoria.class, 1);
		System.out.println(categoriaCacheada.getNome());
		
		
		em2.close();
		factory.close();
	}
}
