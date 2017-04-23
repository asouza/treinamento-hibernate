package br.com.caelum.pmc.treinamentohibernate;

import java.util.List;

public class Curso {

	private String nome;
	private List<String> topicos;
	private Nivel nivel;
	private int estimativaConclusao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Nivel getNivel() {
		return nivel;
	}

	public void setNivel(Nivel nivel) {
		this.nivel = nivel;
	}

	public int getEstimativaConclusao() {
		return estimativaConclusao;
	}

	public void setEstimativaConclusao(int estimativaConclusao) {
		this.estimativaConclusao = estimativaConclusao;
	}

	public List<String> getTopicos() {
		return topicos;
	}

}
