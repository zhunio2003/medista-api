package ista.sistemaClinica.model.dao;

import org.springframework.data.repository.CrudRepository;
import ista.sistemaClinica.model.entity.EmergenciaObstetrica;
import ista.sistemaClinica.model.entity.FichaMedica;
import ista.sistemaClinica.model.entity.Paciente;

public interface IEmergenciaObstetricaDao extends CrudRepository<EmergenciaObstetrica, Long>{
	EmergenciaObstetrica findByfichaMedica(FichaMedica fichaMedica);
}
