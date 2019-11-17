package com.szytka.estacionamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.szytka.estacionamento.domain.Vaga;

@Repository
public interface VagaRepository extends JpaRepository<Vaga, Integer> {
	  
	
}