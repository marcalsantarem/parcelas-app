package com.marcal.parcelas_backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcal.parcelas_backend.dto.FormaPagamentoDTO;
import com.marcal.parcelas_backend.service.FormaPagamentoService;

@RestController
@RequestMapping(value = "/formas")
public class FormaPagamentoController {
	
	@Autowired
	private FormaPagamentoService service;
		
	@GetMapping(value = "/{id}")
	public FormaPagamentoDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

}
