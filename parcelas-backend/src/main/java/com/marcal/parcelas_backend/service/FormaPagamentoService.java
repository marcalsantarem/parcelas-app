package com.marcal.parcelas_backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.marcal.parcelas_backend.dto.FormaPagamentoRequestDTO;
import com.marcal.parcelas_backend.dto.FormaPagamentoResponseDTO;
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
		FormaPagamento forma = new FormaPagamento(dto);
		repository.save(forma);
		return new FormaPagamentoResponseDTO(forma);
	}
	
	public FormaPagamentoResponseDTO update(Long id, FormaPagamentoRequestDTO dto) {
		FormaPagamento forma = repository.findById(id).get();
		forma.setNome(dto.nome());
		forma.setPeriodo(dto.periodo());
		repository.save(forma);
		return new FormaPagamentoResponseDTO(forma);		
	}
	
	public void delete(Long id) {
		if (!repository.existsById(id)) {
			System.out.println("Não existe");
			return;
		}
		repository.deleteById(id);
	}	
	
}
