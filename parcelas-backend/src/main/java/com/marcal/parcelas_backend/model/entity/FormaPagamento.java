package com.marcal.parcelas_backend.model.entity;

import com.marcal.parcelas_backend.model.enums.PeriodoPagamento;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_formapag")
public class FormaPagamento {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
    @Enumerated(EnumType.STRING)
	private PeriodoPagamento periodo;
	
	public FormaPagamento() {}

	public FormaPagamento(Long id, String nome, PeriodoPagamento periodo) {
		this.id = id;
		this.nome = nome;
		this.periodo = periodo;
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
