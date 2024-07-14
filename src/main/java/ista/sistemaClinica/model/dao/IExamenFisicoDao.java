package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;
import ista.sistemaClinica.model.entity.ExamenFisico;

public interface IExamenFisicoDao extends CrudRepository<ExamenFisico, Long>{

}
