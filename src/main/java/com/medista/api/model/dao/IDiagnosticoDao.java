package com.medista.api.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.model.entity.Diagnostico;

public interface IDiagnosticoDao extends CrudRepository<Diagnostico, Long> {

}
