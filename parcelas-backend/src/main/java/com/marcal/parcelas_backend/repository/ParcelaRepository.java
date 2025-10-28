package com.marcal.parcelas_backend.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marcal.parcelas_backend.model.Parcela;

public interface ParcelaRepository extends JpaRepository<Parcela, Long> {

}