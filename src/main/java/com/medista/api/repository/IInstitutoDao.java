package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.entity.Instituto;
import com.medista.api.entity.Titulo;

public interface IInstitutoDao extends CrudRepository<Instituto, Long> {
	Titulo findByidIns(Long idIns);
}
