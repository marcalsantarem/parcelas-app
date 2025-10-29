package com.marcal.parcelas_backend.dto;

import com.marcal.parcelas_backend.model.entity.FormaPagamento;
import com.marcal.parcelas_backend.model.enums.PeriodoPagamento;

public class FormaPagamentoResponseDTO {

	private Long id;
	private String nome;
	private PeriodoPagamento periodo;
	
	public FormaPagamentoResponseDTO() {}

	public FormaPagamentoResponseDTO(Long id, String nome, PeriodoPagamento periodo) {
		this.id = id;
		this.nome = nome;
		this.periodo = periodo;
	}
	
	public FormaPagamentoResponseDTO(FormaPagamento f) {
		this.id = f.getId();
		this.nome = f.getNome();
		this.periodo = f.getPeriodo();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public PeriodoPagamento getPeriodo() {
		return periodo;
	}

	public void setPeriodo(PeriodoPagamento periodo) {
		this.periodo = periodo;
	}	

}
