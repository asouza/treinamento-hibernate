package br.com.caelum.pmc.treinamentohibernate;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Carreira {

	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	private String nome;
	@ManyToOne
	private Categoria categoria;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
