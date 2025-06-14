package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.entity.Diagnostico;

public interface IDiagnosticoDao extends CrudRepository<Diagnostico, Long> {

}
