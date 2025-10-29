package com.marcal.parcelas_backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.marcal.parcelas_backend.dto.ParcelaRequestDTO;
import com.marcal.parcelas_backend.dto.ParcelaResponseDTO;
import com.marcal.parcelas_backend.service.ParcelaService;

@RestController
@RequestMapping(value = "/parcelas")
public class ParcelaController {
	
	@Autowired
	private ParcelaService service;
	
	@GetMapping
	public List<ParcelaResponseDTO> findAll(){
		return service.findAll();		
	}
	
	@GetMapping(value = "/{id}")
	public ParcelaResponseDTO findById(@PathVariable Long id) {
		return service.findById(id);
	}

	@PostMapping
	public ParcelaResponseDTO save(@RequestBody ParcelaRequestDTO dto) {
		return service.save(dto);
	}

	@PutMapping(value = "/{id}")
	public ParcelaResponseDTO update(@PathVariable Long id, @RequestBody ParcelaRequestDTO dto) {
		return service.update(id, dto);
	}
	
	@DeleteMapping(value = "/{id}")
	public void delete(@PathVariable Long id) {
		service.delete(id);
	}


}