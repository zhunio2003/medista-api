package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.Diagnostico;

public interface IDiagnosticoDao extends CrudRepository<Diagnostico, Long> {

}
