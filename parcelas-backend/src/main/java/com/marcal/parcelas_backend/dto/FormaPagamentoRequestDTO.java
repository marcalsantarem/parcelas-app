package com.marcal.parcelas_backend.dto;

import com.marcal.parcelas_backend.model.enums.PeriodoPagamento;

public record FormaPagamentoRequestDTO(
		Long id,
		String nome,
		PeriodoPagamento periodo		
) {}
