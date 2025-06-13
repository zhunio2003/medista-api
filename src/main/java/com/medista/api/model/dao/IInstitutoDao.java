package com.medista.api.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.model.entity.Instituto;
import com.medista.api.model.entity.Titulo;

public interface IInstitutoDao extends CrudRepository<Instituto, Long> {
	Titulo findByidIns(Long idIns);
}
