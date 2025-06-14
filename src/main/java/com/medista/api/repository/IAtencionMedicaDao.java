package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.entity.AtencionMedica;

public interface IAtencionMedicaDao extends CrudRepository<AtencionMedica, Long>{

}
