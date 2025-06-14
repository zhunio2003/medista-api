package com.medista.api.repository;

import org.springframework.data.repository.CrudRepository;

import com.medista.api.entity.Enfermedad;

public interface IEnfermedadDao extends CrudRepository<Enfermedad, Long>{
	Enfermedad findBycodigoEnf(String codigoEnf);
}
