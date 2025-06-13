package com.medista.api.model.dao;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.model.entity.Enfermedad;

public interface IEnfermedadDao extends CrudRepository<Enfermedad, Long>{
	Enfermedad findBycodigoEnf(String codigoEnf);
}
