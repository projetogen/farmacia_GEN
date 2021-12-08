package com.generation.farmacia.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "categoria")

public class CategoriaModel {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

	private @NotNull String categoria;

	private @NotNull Boolean entrega;

	private @NotNull Boolean estoque;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}

	public Boolean getEntrega() {
		return entrega;
	}

	public void setEntrega(Boolean entrega) {
		this.entrega = entrega;
	}

	public Boolean getEstoque() {
		return estoque;
	}

	public void setEstoque(Boolean estoque) {
		this.estoque = estoque;
	}

}
