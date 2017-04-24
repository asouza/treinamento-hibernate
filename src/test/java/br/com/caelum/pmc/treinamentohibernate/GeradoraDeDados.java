package br.com.caelum.pmc.treinamentohibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GeradoraDeDados {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("treinamento");
		EntityManager em = factory.createEntityManager();
		em.getTransaction().begin();
		Categoria mobile = new Categoria();
		mobile.setNome("mobile");
		Categoria programacao = new Categoria();
		programacao.setNome("programcao");
		em.persist(mobile);
		em.persist(programacao);
		
		Carreira ios = new Carreira();
		ios.setCategoria(mobile);
		ios.setNome("ios");
		
		Carreira android = new Carreira();
		ios.setCategoria(mobile);
		ios.setNome("android");
		
		Carreira logica = new Carreira();
		ios.setCategoria(programacao);
		ios.setNome("logica");
		
		Carreira java = new Carreira();
		ios.setCategoria(programacao);
		ios.setNome("java");
		
		em.persist(ios);
		em.persist(android);
		em.persist(logica);
		em.persist(java);
		
		Curso swift = new Curso();
		swift.setEstimativaConclusao(100);
		swift.setNivel(Nivel.BASICO);
		swift.setNome("swift");
		swift.setCarreira(ios);
		
		Curso androidFantastico = new Curso();
		androidFantastico.setEstimativaConclusao(100);
		androidFantastico.setNivel(Nivel.BASICO);
		androidFantastico.setNome("android fantastico");
		androidFantastico.setCarreira(android);
		
		Curso minecraft = new Curso();
		minecraft.setEstimativaConclusao(100);
		minecraft.setNivel(Nivel.BASICO);
		minecraft.setNome("minecraft");
		minecraft.setCarreira(logica);
		
		Curso javaPrimeirosPassos = new Curso();
		javaPrimeirosPassos.setEstimativaConclusao(100);
		javaPrimeirosPassos.setNivel(Nivel.BASICO);
		javaPrimeirosPassos.setNome("minecraft");
		javaPrimeirosPassos.setCarreira(java);
		
		em.persist(swift);
		em.persist(minecraft);
		em.persist(javaPrimeirosPassos);
		em.persist(androidFantastico);
		
		
		
		
		
		
		em.getTransaction().commit();
		em.close();
		
	}
}
