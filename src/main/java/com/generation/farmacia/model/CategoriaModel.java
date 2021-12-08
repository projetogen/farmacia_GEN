package com.generation.farmacia.model;

import java.util.ArrayList;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "categoria")

public class CategoriaModel {
	private @Id @GeneratedValue(strategy = GenerationType.IDENTITY) Long id;

	private @NotNull String categoria;

	private @NotNull Boolean entrega;

	private @NotNull Boolean estoque;
	
	@OneToMany(mappedBy = "categoria", cascade = CascadeType.REMOVE)
	@JsonIgnoreProperties("categoria")
	private List<ProdutoModel> produto = new ArrayList<>();
	

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

	public List<ProdutoModel> getProduto() {
		return produto;
	}

	public void setProduto(List<ProdutoModel> produto) {
		this.produto = produto;
	}
}
