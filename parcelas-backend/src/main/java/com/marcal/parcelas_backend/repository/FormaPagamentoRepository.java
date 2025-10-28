package com.marcal.parcelas_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcal.parcelas_backend.model.entity.FormaPagamento;

public interface FormaPagamentoRepository extends JpaRepository<FormaPagamento, Long> {

}