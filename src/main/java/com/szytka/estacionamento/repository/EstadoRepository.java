package com.szytka.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.szytka.estacionamento.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer> {
	  
	
}