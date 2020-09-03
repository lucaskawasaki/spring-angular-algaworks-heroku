package com.example.algamoneyapi.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.algamoneyapi.model.Pessoa;
import java.lang.String;

public interface PessoaRepository extends JpaRepository<Pessoa, Long>{

	Page<Pessoa> findByNomeContaining(String nome, Pageable pageable);
	
}
