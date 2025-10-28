package com.marcal.parcelas_backend.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_parcela")
public class Parcela {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
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