package com.marcal.parcelas_backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcal.parcelas_backend.dto.FormaPagamentoRequestDTO;
import com.marcal.parcelas_backend.dto.FormaPagamentoResponseDTO;
import com.marcal.parcelas_backend.dto.ParcelaDTO;
import com.marcal.parcelas_backend.model.entity.FormaPagamento;
import com.marcal.parcelas_backend.repository.FormaPagamentoRepository;

@Service
public class FormaPagamentoService {
	
	@Autowired
	private FormaPagamentoRepository repository;

	public List<FormaPagamentoResponseDTO> findAll() {
		return 
			repository.findAll().stream().map(f -> new FormaPagamentoResponseDTO(f)).collect(Collectors.toList());
	}
	
	public FormaPagamentoResponseDTO findById(Long id) {		
		FormaPagamento forma = repository.findById(id).get();
		return new FormaPagamentoResponseDTO(forma);
	}
	
	public FormaPagamentoResponseDTO save(FormaPagamentoRequestDTO dto) {
		FormaPagamento forma = new FormaPagamento(dto.id(), dto.nome(), dto.periodo());
		repository.save(forma);
		return new FormaPagamentoResponseDTO(forma);
	}
	
}
