package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;
import ista.sistemaClinica.model.entity.EnfermedadDiagnostico;

public interface IEnfermedadDiagnosticoDao extends CrudRepository<EnfermedadDiagnostico, Long>{

}
