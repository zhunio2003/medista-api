package com.medista.api.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.model.entity.AtencionMedica;

public interface IAtencionMedicaDao extends CrudRepository<AtencionMedica, Long>{

}
