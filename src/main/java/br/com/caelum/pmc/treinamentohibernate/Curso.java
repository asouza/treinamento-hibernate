package br.com.caelum.pmc.treinamentohibernate;

import java.util.List;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Curso {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;	
	private String nome;
	@ElementCollection
	private List<String> topicos;
	@Enumerated(EnumType.STRING)
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
