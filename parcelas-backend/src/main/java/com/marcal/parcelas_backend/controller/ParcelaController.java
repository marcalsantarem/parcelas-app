package com.marcal.parcelas_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcal.parcelas_backend.dto.ParcelaDTO;
import com.marcal.parcelas_backend.service.ParcelaService;

@RestController
@RequestMapping(value = "/parcelas")
public class ParcelaController {
	
	@Autowired
	private ParcelaService service;
	
	@GetMapping
	public List<ParcelaDTO> findAll(){
		return service.findAll();		
	}
	
	@GetMapping(value = "/{id}")
	public ParcelaDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

}