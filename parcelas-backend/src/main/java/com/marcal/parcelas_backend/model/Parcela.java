package com.marcal.parcelas_backend.model;

public class Parcela {
	
	private Long id;
	private String descricao;
	private Double valor;
	
	public Parcela() {}
	
	public Parcela(Long id, String descricao, Double valor) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
	}
	
	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getValor() {
		return valor;
	}
	
	public void setValor(Double valor) {
		this.valor = valor;
	}
		
}