package com.marcal.parcelas_backend.dto;

import com.marcal.parcelas_backend.model.entity.Parcela;

public class ParcelaDTO {
	
	private Long id;
	private String descricao;
	private Double valor;
	private Long formaPagamentoId;
	
	public ParcelaDTO() {}

	public ParcelaDTO(Long id, String descricao, Double valor, Long formaPagamentoId) {
		this.id = id;
		this.descricao = descricao;
		this.valor = valor;
		this.formaPagamentoId = formaPagamentoId;
	}	

	public ParcelaDTO(Parcela p) {
		this.id = p.getId();
		this.descricao = p.getDescricao();
		this.valor = p.getValor();
		this.formaPagamentoId = p.getFormaPagamento().getId();
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

	public Long getFormaPagamentoId() {
		return formaPagamentoId;
	}

	public void setFormaPagamentoId(Long formaPagamentoId) {
		this.formaPagamentoId = formaPagamentoId;
	}

}