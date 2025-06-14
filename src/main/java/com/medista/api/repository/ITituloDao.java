package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;


import com.medista.api.entity.Titulo;

public interface ITituloDao extends CrudRepository<Titulo, Long>{
	Titulo findByidTit(Long idTit);
	}

