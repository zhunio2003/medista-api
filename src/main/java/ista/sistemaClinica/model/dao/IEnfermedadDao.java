package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Enfermedad;

public interface IEnfermedadDao extends CrudRepository<Enfermedad, Long>{
	Enfermedad findBycodigoEnf(String codigoEnf);
}
