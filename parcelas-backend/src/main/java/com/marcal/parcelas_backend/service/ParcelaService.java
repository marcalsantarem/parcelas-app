package com.marcal.parcelas_backend.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.marcal.parcelas_backend.dto.ParcelaDTO;
import com.marcal.parcelas_backend.model.Parcela;
import com.marcal.parcelas_backend.repository.ParcelaRepository;

@Service
public class ParcelaService {
	
	@Autowired
	private ParcelaRepository repository;
	
	@Transactional(readOnly = true)
	public ParcelaDTO findById(Long id) {		
		Parcela parcela = repository.findById(id).get();
		ParcelaDTO dto = new ParcelaDTO(parcela);
		return dto;
	}

	@Transactional(readOnly = true)
	public List<ParcelaDTO> findAll() {
		return 
			repository.findAll().stream().map(p -> new ParcelaDTO(p)).collect(Collectors.toList());
	}

}

