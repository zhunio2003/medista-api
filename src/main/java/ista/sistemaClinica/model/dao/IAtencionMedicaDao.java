package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;

import ista.sistemaClinica.model.entity.AtencionMedica;

public interface IAtencionMedicaDao extends CrudRepository<AtencionMedica, Long>{

}
