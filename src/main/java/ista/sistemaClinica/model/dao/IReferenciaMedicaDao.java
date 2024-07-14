package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;
import ista.sistemaClinica.model.entity.ReferenciaMedica;

public interface IReferenciaMedicaDao extends CrudRepository<ReferenciaMedica, Long>{

}
