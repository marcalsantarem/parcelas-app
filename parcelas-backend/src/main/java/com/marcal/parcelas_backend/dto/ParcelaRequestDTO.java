package com.marcal.parcelas_backend.dto;

public record ParcelaRequestDTO(
	String descricao,
	Double valor,
	Long formaPagamentoId
) {}