package com.marcal.parcelas_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcal.parcelas_backend.dto.FormaPagamentoRequestDTO;
import com.marcal.parcelas_backend.dto.FormaPagamentoResponseDTO;
import com.marcal.parcelas_backend.service.FormaPagamentoService;

@RestController
@RequestMapping(value = "/formas")
public class FormaPagamentoController {
	
	@Autowired
	private FormaPagamentoService service;
	
	@GetMapping
	public List<FormaPagamentoResponseDTO> findAll(){
		return service.findAll();		
	}
		
	@GetMapping(value = "/{id}")
	public FormaPagamentoResponseDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}
	
	@PostMapping
	public FormaPagamentoResponseDTO save(@RequestBody FormaPagamentoRequestDTO dto) {
		return service.save(dto);
	}

}
