package com.medista.api.model.dao;

import org.springframework.data.repository.CrudRepository;


import com.medista.api.model.entity.Titulo;

public interface ITituloDao extends CrudRepository<Titulo, Long>{
	Titulo findByidTit(Long idTit);
	}

