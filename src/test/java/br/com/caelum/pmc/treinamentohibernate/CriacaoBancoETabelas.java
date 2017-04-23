package br.com.caelum.pmc.treinamentohibernate;

import javax.persistence.Persistence;

public class CriacaoBancoETabelas {

	public static void main(String[] args) {
		Persistence.createEntityManagerFactory("treinamento");
	}
}
