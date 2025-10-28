package com.marcal.parcelas_backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcal.parcelas_backend.dto.FormaPagamentoDTO;
import com.marcal.parcelas_backend.model.entity.FormaPagamento;
import com.marcal.parcelas_backend.repository.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {
	
	@Autowired
	private FormaPagamentoRepository repository;
	
	@Transactional(readOnly = true)
	public FormaPagamentoDTO findById(Long id) {		
		FormaPagamento forma = repository.findById(id).get();
		FormaPagamentoDTO dto = new FormaPagamentoDTO(forma);
		return dto;
	}

}
