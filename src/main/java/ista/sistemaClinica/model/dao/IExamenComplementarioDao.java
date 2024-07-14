package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;
import ista.sistemaClinica.model.entity.ExamenComplementario;

public interface IExamenComplementarioDao extends CrudRepository<ExamenComplementario, Long> {

}
