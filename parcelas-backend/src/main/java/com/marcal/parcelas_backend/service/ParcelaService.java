package com.marcal.parcelas_backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcal.parcelas_backend.dto.ParcelaRequestDTO;
import com.marcal.parcelas_backend.dto.ParcelaResponseDTO;
import com.marcal.parcelas_backend.model.entity.FormaPagamento;
import com.marcal.parcelas_backend.model.entity.Parcela;
import com.marcal.parcelas_backend.repository.FormaPagamentoRepository;
import com.marcal.parcelas_backend.repository.ParcelaRepository;

@Service
public class ParcelaService {
	
	@Autowired
	private ParcelaRepository repository;
	@Autowired
	private FormaPagamentoRepository formaPagamentoRepository;

	public List<ParcelaResponseDTO> findAll() {
		return 
			repository.findAll().stream().map(p -> new ParcelaResponseDTO(p)).collect(Collectors.toList());
	}
	
	public ParcelaResponseDTO findById(Long id) {		
		Parcela parcela = repository.findById(id).get();
		ParcelaResponseDTO dto = new ParcelaResponseDTO(parcela);
		return dto;
	}
	
	public ParcelaResponseDTO save(ParcelaRequestDTO dto) {
		Parcela p = new Parcela();
		p.setDescricao(dto.descricao());
		p.setValor(dto.valor());
		FormaPagamento forma = formaPagamentoRepository.findById(dto.formaPagamentoId()).get();
		p.setFormaPagamento(forma);
		repository.save(p);
		return new ParcelaResponseDTO(p);
	}

}

